package com.example.cloud.demoboothelloworld.jdbcSql;


import com.example.cloud.demoboothelloworld.jdbcSql.annotation.AssembleSql;
import com.example.cloud.demoboothelloworld.jdbcSql.entity.UserEntity;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.util.*;

/**
 * @Project Name: demo-all
 * @File Name: SelectTest
 * @Date: 2023/2/17 14:24
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2023,All Rights Reserved.
 */
public class SelectTest {

    @Test
    public void Test01() {

        UserEntity userEntity = new UserEntity();
        userEntity.setName("孙悟空");
        AssembleSql assembleSql1 = AssembleSql.buildSql(userEntity);
        System.out.println(assembleSql1);
    }


    /**
     * * INSERT INTO public."TEST_USER"
     * * (user_name, role_name)
     * * VALUES('', '')
     */
    @Test
    public void listToString() {
        List<String> stringList = new ArrayList<>();
        stringList.add("user_name");
        stringList.add("user_code");
        String fieldStr = String.join(":", stringList);
        StringJoiner result = new StringJoiner(",", "(", ")");
        result.add(fieldStr);
        System.out.println(result.toString());

    }


    @Test
    public void dateaTest() {
        LocalDate date = LocalDate.parse("2017-02-03");
        System.out.println(date.minusDays(2));//2017-02-01
        System.out.println(date.minusDays(-2));//2017-02-01


    }

    @Test
    public void TestCompare() {
        Map<String, Object> kafkaDataMap = new HashMap<>() {{
//            put("name", "100.00");
            //  put("name", "100.00");
            put("name1", "100.00");
            //  put("name2", UUID.fromString("fee930f3-7dce-4bfb-ae22-39edcce5e41f"));
            put("name3", "1");
            put("Integer", "10.00");
            put("bool", "false");

        }};
        //以目标库的为标准
        Map<String, Object> databaseDataMap = new HashMap<>() {{
            //    put("name", new BigDecimal("100"));
            put("name1", "100.00");
            put("name3", 1L);
            put("Integer", 10);
            put("bool", false);


        }};
        Boolean flg = characterFormtting(kafkaDataMap, databaseDataMap);
        System.out.println(flg);

    }


    private Boolean characterFormtting(Map<String, Object> kafkaDataMap, Map<String, Object> databaseDataMap) {
        if (kafkaDataMap == null && databaseDataMap != null) {
            return false;
        }
        if (kafkaDataMap != null && databaseDataMap == null) {
            return false;
        }
        //如果key的长度不相等也是不一样
        if (kafkaDataMap.entrySet().size() != databaseDataMap.entrySet().size()) {
            return false;
        }
        List<String> list = new ArrayList<>();
        kafkaDataMap.forEach((k1, v1) -> {
            Object targetValue = databaseDataMap.get(k1);
            if (targetValue == null && v1 != null) {
                list.add(k1);
                return;
            }
            if (targetValue != null && v1 == null) {
                list.add(k1);
                return;
            }
            if (targetValue != null && v1 != null) {
                if (!targetValue.getClass().isAssignableFrom(v1.getClass())) {
//                    if (targetValue.getClass().isAssignableFrom(Number.class)) {
                    if (targetValue instanceof Number) {
                        Boolean judgeFlg = BigDecimalUtil.INSTANCE.equalOrNot(targetValue, v1);
                        if (!judgeFlg) {
                            list.add(k1);
                            return;
                        }
                    } else {
                        if (!targetValue.toString().equals(v1.toString())) {
                            list.add(k1);
                            return;
                        }
                    }
                }
            } else {
                if (!targetValue.toString().equals(v1.toString())) {
                    list.add(k1);
                    return;
                }
            }
        });
        if (CollectionUtils.isEmpty(list)) {
            return true;
        }
        System.out.println("list" + list);
        return false;


    }

}

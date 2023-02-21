package com.example.cloud.demoboothelloworld.jdbcSql;


import com.example.cloud.demoboothelloworld.jdbcSql.annotation.AssembleSql;
import com.example.cloud.demoboothelloworld.jdbcSql.entity.UserEntity;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

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


}

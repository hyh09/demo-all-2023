package com.example.cloud.demoboothelloworld.jdbcSql;


import com.example.cloud.demoboothelloworld.jdbcSql.annotation.AssembleSql;
import com.example.cloud.demoboothelloworld.jdbcSql.entity.UserEntity;
import org.junit.jupiter.api.Test;

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


}

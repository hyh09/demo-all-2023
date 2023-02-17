package com.example.cloud.demoboothelloworld.jdbcSql.entity;


import com.example.cloud.demoboothelloworld.jdbcSql.annotation.SqlColumnAnnotation;
import com.example.cloud.demoboothelloworld.jdbcSql.annotation.SqlOnFromTableAnnotation;
import lombok.Builder;
import lombok.Data;

/**
 * @Project Name: demo-all
 * @File Name: UserEntity
 * @Date: 2023/2/17 14:17
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2023,All Rights Reserved.
 */
@Data
@Builder
@SqlOnFromTableAnnotation(from = "  tb_user t1 left JOIN hs_user_extension h1 on t1.id = h1.id   ", whereValue = " 1=1 ")
public class UserEntityTest001 {

    @SqlColumnAnnotation(name = "h1.user_name", queryWhere = "")
    private String name;

    @SqlColumnAnnotation(name = "h1.phone_number", queryWhere = "")
    private String phone;
}

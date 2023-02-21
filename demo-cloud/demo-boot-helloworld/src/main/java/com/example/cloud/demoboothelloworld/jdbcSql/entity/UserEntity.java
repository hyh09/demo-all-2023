package com.example.cloud.demoboothelloworld.jdbcSql.entity;


import com.example.cloud.demoboothelloworld.jdbcSql.annotation.SqlColumnAnnotation;
import com.example.cloud.demoboothelloworld.jdbcSql.annotation.SqlOnFromTableAnnotation;
import com.example.cloud.demoboothelloworld.jdbcSql.annotation.singleTable.SingleColumn;
import com.example.cloud.demoboothelloworld.jdbcSql.annotation.singleTable.SingleTableName;
import lombok.Data;
import lombok.ToString;

/**
 * @Project Name: demo-all
 * @File Name: UserEntity
 * @Date: 2023/2/17 14:17
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2023,All Rights Reserved.
 */
@Data
@ToString
@SqlOnFromTableAnnotation(from = "  tb_user t1 left JOIN hs_user_extension h1 on t1.id = h1.id   ", whereValue = " 1=1 ")
@SingleTableName(name = "test_user")
public class UserEntity {

    @SqlColumnAnnotation(name = "h1.user_name", queryWhere = " h1.user_name = (:name)")
    @SingleColumn(name = "user_name", updatable = false, insertable = false)
    private String name;

    @SqlColumnAnnotation(name = "h1.phone_number", queryWhere = "")
    @SingleColumn(name = "role_name")
    private String phone;
}

package com.example.demospringdatacassandra.cassandra.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
/*
CREATE TABLE school.users (
                             id bigint PRIMARY KEY,
                             username varchar,
                             password varchar,
                             email varchar
);


CREATE KEYSPACE IF NOT EXISTS school
    WITH REPLICATION = {'class': 'SimpleStrategy','replication_factor':1};


 */

/**
 * @Project Name: demo-all
 * @File Name: User
 * @Date: 2023/2/17 22:59
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2023,All Rights Reserved.
 */
@Table(value = "users")
@Data
@ToString
public class User {

    @Id
    @PrimaryKey
    private Long id;

    private String username;
    private String password;
    private String email;
}

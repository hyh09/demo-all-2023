package com.example.demospringdatacassandra.cassandra.repository;

import com.example.demospringdatacassandra.cassandra.entity.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

/**
 * @Project Name: demo-all
 * @File Name: UserRepository
 * @Date: 2023/2/17 23:01
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2023,All Rights Reserved.
 */
@Repository
public interface UserRepository extends CassandraRepository<User, String> {


}

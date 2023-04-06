package com.example.all.demojpa.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//import org.thingsboard.server.dao.sql.external.dao.ExternalInterfaceDao;
//import org.thingsboard.server.dao.sql.external.dao.PushConfTableDao;

/**
 * @Project Name: iot-business
 * @File Name: DatasourceJapConfig
 * @Date: 2022/8/17 13:02
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2022,All Rights Reserved.
 */
@Configuration
@ComponentScan({"com.example.all.demojpa.dao"})
@EntityScan({"com.example.all.demojpa.entity"})
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = {"com.example.all.demojpa.dao"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {
//                ExternalInterfaceDao.class,
//                PushConfTableDao.class

        })},
        entityManagerFactoryRef = "entityManagerFactory",
        transactionManagerRef = "transactionManager",
        enableDefaultTransactions = true
)
public class DatasourceJapConfig {
}

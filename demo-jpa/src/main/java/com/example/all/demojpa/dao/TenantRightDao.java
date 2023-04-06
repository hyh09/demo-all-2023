package com.example.all.demojpa.dao;

import com.example.all.demojpa.entity.TenantRightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Project Name: iot-business
 * @File Name: TenantRightDao
 * @Date: 2023/4/6 9:54
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2023,All Rights Reserved.
 */
public interface TenantRightDao extends JpaRepository<TenantRightEntity, String>, JpaSpecificationExecutor<TenantRightEntity> {
}

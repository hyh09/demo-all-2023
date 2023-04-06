package com.example.all.demojpa.entity;

import com.example.all.demojpa.constans.JpaTableConstants;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Project Name: iot-business
 * @File Name: TenantRightEntity
 * @Date: 2023/4/6 9:39
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2023,All Rights Reserved.
 */
@Data
@Entity
@Table(name = JpaTableConstants.TENANT_RIGHT_TABLE)
@NoArgsConstructor
public class TenantRightEntity implements Serializable {

    /**
     * 租户id
     */
    @Id
    @Column(name = JpaTableConstants.ID_PROPERTY)
    protected String id;
    /**
     * 租户编号
     */
    @Column(name = JpaTableConstants.CODE_PROPERTY)
    protected String tenantCode;

    /**
     * 租户名称
     */
    @Column(name = JpaTableConstants.NAME_PROPERTY)
    private String tenantName;
    /**
     * 默认=0，值由各产品自行定义
     */
    @Column(name = JpaTableConstants.TYPE_PROPERTY)
    private Integer tenantType;
    /**
     * 修改时间
     */
    @Column(name = JpaTableConstants.RIGHT_COLUMN_MODIFY_TIME)
    private String modifyTime;
    /**
     * 租户标签
     */
    @Column(name = JpaTableConstants.TENANT_RIGHT_COLUMN_TAG)
    private String tag;
}

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
@Table(name = JpaTableConstants.USER_RIGHT_TABLE)
@NoArgsConstructor
public class UserRightEntity implements Serializable {

    /**
     * 用户id
     * 【必填】
     */
    @Id
    @Column(name = JpaTableConstants.ID_PROPERTY)
    private String id;
    /**
     * 用户编码
     */
    @Column(name = JpaTableConstants.CODE_PROPERTY)
    private String userNo;
    /**
     * 密码 （密文)
     */
    @Column(name = JpaTableConstants.USER_RIGHT_COLUMN_PASSWORD)
    private String password;
    /**
     * 加密方式
     * 1-default；2-tiip
     */
    @Column(name = JpaTableConstants.USER_RIGHT_COLUMN_ENCRYPT_TYPE)
    private Integer encryptType;
    /**
     * 修改时间
     */
    @Column(name = JpaTableConstants.RIGHT_COLUMN_MODIFY_TIME)
    private String modifyTime;
}

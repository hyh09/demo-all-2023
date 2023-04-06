package com.example.all.demojpa.constans;

import lombok.NoArgsConstructor;

/**
 * @Project Name: iot-business
 * @File Name: JpaTableConstants
 * @Date: 2022/8/17 13:14
 * @author: wb04
 * 业务中文描述:   ModelConstants
 * Copyright (c) 2022,All Rights Reserved.
 */
@NoArgsConstructor
public class JpaTableConstants {
    /**
     * 基础的公用字段
     */
    public static final String ID_PROPERTY = "id";
    public static final String NAME_PROPERTY = "name";
    public static final String CODE_PROPERTY = "code";
    public static final String TYPE_PROPERTY = "type";
    ////tenant_id
    public static final String FACTORY_ID = "factory_Id";
    //设备的additional_info
    /**
     * entity_id
     */
    public static final String USER_ID = "USER_ID";
    public static final String ROLE_ID = "ROLE_ID";
    public static final String MENU_ID = "MENU_ID";
    public static final String OPEN_ID = "OPEN_ID";
    public static final String NOTES = "NOTES";
    public static final String FLG = "flg";


    /**
     * 对接上海的租户的表
     */
    public static final String TENANT_RIGHT_TABLE = "HS_TENANT_RIGHT";
    public static final String RIGHT_COLUMN_MODIFY_TIME = "modify_time";
    public static final String TENANT_RIGHT_COLUMN_TAG = "tag";


    public static final String USER_RIGHT_TABLE = "HS_USER_RIGHT";
    public static final String USER_RIGHT_COLUMN_PASSWORD = "password";
    public static final String USER_RIGHT_COLUMN_ENCRYPT_TYPE = "encrypt_type";


}


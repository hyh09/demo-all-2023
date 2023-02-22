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
@SqlOnFromTableAnnotation(from = " ( SELECT A.sOrderNo,tTime=MAX(CONVERT(NVARCHAR(10),C.tUpdateTime,120))\n" +
        "FROM dbo.sdOrderHdr A(NOLOCK)\n" +
        "JOIN dbo.sdOrderDtl B(NOLOCK) ON B.usdOrderHdrGUID=A.uGUID\n" +
        "JOIN dbo.sdOrderLot C(NOLOCK) ON C.usdOrderDtlGUID = B.uGUID AND C.sLotStatus='完成' \n" +
        "LEFT JOIN dbo.sdOrderLot D(NOLOCK) ON D.usdOrderDtlGUID = B.uGUID AND D.sLotStatus='生产' \n" +
        "WHERE D.uGUID IS NULL\n" +
        "GROUP BY A.sOrderNo\n" +
        "HAVING MAX(C.tUpdateTime)>=DATEADD(DAY,-7,CONVERT(NVARCHAR(10),GETDATE(),120))  )A1 ", groupByLast = " GROUP BY A1.tTime ")
@SingleTableName(name = "test_user")
public class UserEntity {

    @SqlColumnAnnotation(name = "A1.tTime")
    private String name;

    @SqlColumnAnnotation(name = "COUNT(1) ", queryWhere = "")
    @SingleColumn(name = "role_name")
    private String phone;
}

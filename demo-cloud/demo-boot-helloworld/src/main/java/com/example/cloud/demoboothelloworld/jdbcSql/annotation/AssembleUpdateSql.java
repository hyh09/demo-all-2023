package com.example.cloud.demoboothelloworld.jdbcSql.annotation;

import com.example.cloud.demoboothelloworld.jdbcSql.annotation.singleTable.SingleTableName;
import lombok.Data;
import lombok.ToString;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

/**
 * @Project Name: demo-all
 * @File Name: AssembleSql
 * @Date: 2023/2/17 14:35
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2023,All Rights Reserved.
 */
@Data
@ToString
public class AssembleUpdateSql {

    private String sqlAll;

    private Map<String, ?> values;

    public AssembleUpdateSql(String sqlAll) {
        this.sqlAll = sqlAll;
    }

    public AssembleUpdateSql(String sqlAll, Map<String, ?> values) {
        this.sqlAll = sqlAll;
        this.values = values;
    }

    public static <T> AssembleSql buildSql(T t) {
        AssembleUpdateSql.AssembleBuildUpdateSql assembleBuildSql = new AssembleUpdateSql.AssembleBuildUpdateSql().buildSqlUpdateTable(t);
        return null;
    }


    /**
     * UPDATE public.test_user
     * SET role_name='', user_name=''
     * where
     */
    public static class AssembleBuildUpdateSql {
        private String updateTable;

        private String setSql;

        private String whereSql;

        private Map<String, ?> values;

        private Object object;


        AssembleBuildUpdateSql() {
        }

        public <T> AssembleUpdateSql.AssembleBuildUpdateSql buildSqlUpdateTable(T t) {
            this.object = t;
            SingleTableName singleTableName = t.getClass().getAnnotation(SingleTableName.class);
            if (singleTableName == null) {
                //后面可以优化，将类的名称，驼峰命名改为下划线的风格
                throw new RuntimeException("该类没有配置：SingleTableName注解的表名");
            }
            String fromSql = singleTableName.name();
            if (StringUtils.isEmpty(fromSql)) {
                throw new RuntimeException("该类没有配置：SingleTableName注解的表名");
            }
            this.updateTable = " UPDATE " + fromSql + " ";
            return this;
        }
    }
}

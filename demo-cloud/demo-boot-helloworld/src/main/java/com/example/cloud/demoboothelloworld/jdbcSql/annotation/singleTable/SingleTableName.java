package com.example.cloud.demoboothelloworld.jdbcSql.annotation.singleTable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SingleTableName {

    String name() default "";
}

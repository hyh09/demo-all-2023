package com.example.cloud.demoboothelloworld.jdbcSql.annotation.singleTable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SingleColumn {

    String name() default "";

    boolean insertable() default true;

    boolean updatable() default true;
}

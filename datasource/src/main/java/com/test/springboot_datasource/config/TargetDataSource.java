package com.test.springboot_datasource.config;

import java.lang.annotation.*;

/**
 * @Author jing.ji
 * @Date 2018-08-13
 * @Description 作用于类、接口或者方法上
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {

    String name();
}

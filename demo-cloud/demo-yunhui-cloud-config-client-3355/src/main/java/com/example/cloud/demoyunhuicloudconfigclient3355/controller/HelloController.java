package com.example.cloud.demoyunhuicloudconfigclient3355.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project Name: demo-all
 * @File Name: HelloController
 * @Date: 2023/2/28 17:39
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2023,All Rights Reserved.
 */
@RestController
public class HelloController {

    @RequestMapping
    public String hello() {
        return "hello world";
    }
}

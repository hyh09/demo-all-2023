package com.example.cloud.demoyunhuicloudconfig.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project Name: demo-all
 * @File Name: HelloController
 * @Date: 2023/2/28 13:32
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2023,All Rights Reserved.
 */
@RestController
@RequestMapping
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}

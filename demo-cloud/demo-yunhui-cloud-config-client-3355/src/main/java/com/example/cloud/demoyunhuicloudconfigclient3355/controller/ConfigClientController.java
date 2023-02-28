package com.example.cloud.demoyunhuicloudconfigclient3355.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project Name: demo-all
 * @File Name: ConfigClientController
 * @Date: 2023/2/28 21:25
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2023,All Rights Reserved.
 */
@RestController
public class ConfigClientController {
    @Value("${server.port}")
    private String serverPort;
    @Value("${config.info}")
    private String configInfo;
    @Value("${config.version}")
    private String configVersion;

    @GetMapping(value = "/getConfig")
    public String getConfig() {
        return "info：" + configInfo + "<br/>version：" + configVersion + "<br/>port：" + serverPort;
    }
}

package com.example.cloud.demonetflixeurekaconsumer.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Project Name: demo-all
 * @File Name: ConsumerController
 * @Date: 2023/2/13 20:01
 * @author: wb04
 * 业务中文描述:
 * Copyright (c) 2023,All Rights Reserved.
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/callHello")
    public String callHello() {
        return restTemplate.getForObject("http://HUYUNHUI-PROVIDER-HOUSE/hello", String.class);
    }
}

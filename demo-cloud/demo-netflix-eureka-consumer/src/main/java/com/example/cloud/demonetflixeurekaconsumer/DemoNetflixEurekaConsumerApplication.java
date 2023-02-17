package com.example.cloud.demonetflixeurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoNetflixEurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoNetflixEurekaConsumerApplication.class, args);
    }

}

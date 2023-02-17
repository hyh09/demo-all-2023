package com.example.cloud.demonetflixeurekaprovice01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoNetflixEurekaProvice01Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoNetflixEurekaProvice01Application.class, args);
    }

}

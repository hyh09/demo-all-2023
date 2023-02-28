package com.example.cloud.demoyunhuicloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer

public class DemoYunhuiCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoYunhuiCloudConfigApplication.class, args);
    }

}

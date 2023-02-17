package com.example.cloud.demoboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoBootHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoBootHelloworldApplication.class, args);
    }

}

package com.example.demospringdatacassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableCassandraRepositories(basePackages = "com.example.demospringdatacassandra.cassandra")
public class DemoSpringDataCassandraApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringDataCassandraApplication.class, args);
    }

}

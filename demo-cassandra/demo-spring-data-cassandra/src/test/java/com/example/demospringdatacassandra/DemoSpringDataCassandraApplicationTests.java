package com.example.demospringdatacassandra;

import com.example.demospringdatacassandra.cassandra.entity.User;
import com.example.demospringdatacassandra.cassandra.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoSpringDataCassandraApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
        User user = new User();
        user.setEmail("455663056@qq.com");
        user.setId(1L);
        user.setUsername("孙武空");
        user.setPassword("123456");
        userRepository.save(user);
    }

}

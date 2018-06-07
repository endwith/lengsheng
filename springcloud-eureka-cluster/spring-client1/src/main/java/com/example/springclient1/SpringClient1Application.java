package com.example.springclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//@EnableDiscoveryClient // Eureka Discovery Client 标识
@EnableEurekaClient // Eureka Client 标识 向服务中心注册
@SpringBootApplication // Spring Boot 应用标识
public class SpringClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringClient1Application.class, args);
    }
}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer//Eureka Server 标识
@SpringBootApplication
public class Demo123455Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo123455Application.class, args);
    }
}

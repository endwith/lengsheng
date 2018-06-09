package com.example.springconfserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableConfigServer  //conf-server 启动注解
@SpringBootApplication
public class SpringConfServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfServerApplication.class, args);
    }
}

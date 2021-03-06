package com.example.springfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients   //@EnableFeignClients注解开启Feign的功能
@SpringBootApplication
public class SpringfeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringfeignApplication.class, args);
    }
}

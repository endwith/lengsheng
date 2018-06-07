package com.example.springzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy  //  开启zuul功能
@EnableEurekaClient //注册
@SpringBootApplication
public class SpringZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringZuulApplication.class, args);
    }
}

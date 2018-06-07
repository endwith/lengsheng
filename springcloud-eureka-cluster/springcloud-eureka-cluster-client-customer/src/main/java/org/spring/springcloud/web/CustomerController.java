package org.spring.springcloud.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Customer HelloWorld 案例
 * <p>
 * Created by bysocket on 06/22/17.
 */
@RestController
public class CustomerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private RestTemplate restTemplate; // HTTP 访问操作类 调用负载均衡

    @RequestMapping("/mycustomer")
    public String customer() {
        //连接对应客户端cluster-customer-service
        String providerMsg = restTemplate.getForEntity("http://CLUSTER-CUSTOMER-SERVICE/customer",
                String.class).getBody();

        return "Hello,Customer!" + providerMsg;
    }

}
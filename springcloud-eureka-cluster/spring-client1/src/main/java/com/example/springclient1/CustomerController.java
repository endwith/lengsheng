package com.example.springclient1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Customer HelloWorld 案例
 * <p>
 * Created by bysocket on 06/22/17.
 */


@RestController
public class CustomerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private Registration registration;

    @Value("${server.port}")//获取配置文件中值
            String port;

    @RequestMapping("/customer")
    public String customer() {
       // ServiceInstance instance = this.serviceInstance();
//        LOGGER.info("provider service, host = " + instance.getHost()
//                + ", service_id = " + instance.getServiceId());
        return "Hello,Customer!i am from port" + port;
      }
      //调用此方法可以获取本实例的服务的mane和id
//    public ServiceInstance serviceInstance() {
//        List<ServiceInstance> list = discoveryClient.getInstances( registration.getServiceId());
//        if (list != null && list.size() > 0) {
//            return list.get(0);
//        }
//        return null;
//    }
}
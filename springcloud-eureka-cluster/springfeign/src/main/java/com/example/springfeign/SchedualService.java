package com.example.springfeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *提供一个java接口连接服务， 接口中的方法对应url接口就能直接访问了，不需要ribbon实例服务提供者
 */
//@FeignClient声明feign，添加fallback熔断器实现类
@FeignClient(value = "cluster-customer-service",fallback=SchedualServiceHystric.class)
public interface SchedualService {
    @RequestMapping(value = "/customer",method = RequestMethod.GET)
    String FromClient();
}
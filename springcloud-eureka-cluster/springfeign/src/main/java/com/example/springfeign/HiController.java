package com.example.springfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    SchedualService schedualService;
    /**
     *调用接口中的方法，就能直接访问对应的客户端中的url接口
     */
    @RequestMapping(value = "/mycustomer",method = RequestMethod.GET)
    public String sayHi(){
        return schedualService.FromClient();
    }
}
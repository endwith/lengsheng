package com.longhang.mq.controller;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping(value = "/send" ,method = RequestMethod.GET)
    public void SennerMsg(String msg){
        amqpTemplate.convertAndSend("exchange","a",msg);
    }


}
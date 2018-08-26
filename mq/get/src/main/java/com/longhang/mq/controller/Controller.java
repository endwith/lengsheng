package com.longhang.mq.controller;

import com.longhang.mq.hander.MyWebSocketHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.TextMessage;


@RestController
public class Controller {
    @Autowired
    public MyWebSocketHandler handler;
    @RequestMapping(value = "/get" ,method = RequestMethod.GET)
    public String SennerMsg(){
        return "index";
    }
    @RabbitListener(queues = "queue")
    public void Recive(String msg) throws Exception{
        handler.sendMsgToJsp(new TextMessage(msg), "A");
    }
}
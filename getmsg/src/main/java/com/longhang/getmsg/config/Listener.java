package com.longhang.getmsg.config;


import com.longhang.getmsg.hander.MyWebSocketHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.TextMessage;
@Configuration
public class Listener {
    @Autowired
    MyWebSocketHandler handler;
    @RabbitListener(queues = "queue")
    public void Recive(String msg) throws Exception{
        System.out.println("****************"+msg);
        handler.sendMsgToJsp(new TextMessage(msg), "A");
        System.out.println("*******"+msg);
    }
}

package com.longhang;

import com.longhang.getmsg.hander.MyWebSocketHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;

@SpringBootApplication
public class GetmsgApplication {


    public static void main(String[] args) {
        SpringApplication.run(GetmsgApplication.class, args);
    }


}

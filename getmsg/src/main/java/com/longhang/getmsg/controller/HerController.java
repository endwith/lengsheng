package com.longhang.getmsg.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HerController {


    @RequestMapping(value = "/get" )
    public String SennerMsg(String name){
        return "index";
    }

}

package com.ptteng.controller;

import com.alibaba.fastjson.JSONObject;
import com.ptteng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RefreshScope
@RestController
public class UserController {
    @Autowired
    UserService userService;

    /**
     *(没有cookie重定向接口)
     */
    @RequestMapping(value ="/a/outerRecord", produces="application/json",method = RequestMethod.GET)
    public JSONObject outerRecord() {
     return userService.outerRecord();
    }
    /**
     * 44权限模块显示
     */
    @RequestMapping(value ="/a/u/loginer", produces="application/json",method = RequestMethod.GET)
    @ResponseBody
    public JSONObject showRoleModule(HttpServletRequest request,HttpServletResponse response) {
        return userService.showRoleModule(request,response);
    }
    /**
     *98密码管理
     */
    @RequestMapping(value ="/a/u/password", produces="application/json",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject updatePassword(String lastPassword, String newPassword1, String newPassword2,HttpServletRequest request){
        return userService.updatePassword(lastPassword, newPassword1, newPassword2,request);
    }


}

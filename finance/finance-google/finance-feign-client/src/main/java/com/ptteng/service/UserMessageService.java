package com.ptteng.service;

import com.alibaba.fastjson.JSONObject;
import com.ptteng.service.impl.UserMessageServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 *提供一个java接口连接服务， 接口中的方法对应url接口就能直接访问了，不需要ribbon实例服务提供者
 */
//@FeignClient声明feign，添加fallback熔断器实现类
@FeignClient(value = "finance-client",fallback=UserMessageServiceHystric.class)

public interface UserMessageService {
    /**
     *16我的
     */
    @RequestMapping(value ="/a/u/my-messages", produces="application/json",method = RequestMethod.GET)
    JSONObject myMessage(@RequestParam(value = "request",required = false)HttpServletRequest request);
    /**
     *16显示个人信息
     */
    @RequestMapping(value ="/a/u/own-messages", produces="application/json",method = RequestMethod.GET)
     JSONObject getMessages(@RequestParam(value = "request",required = false)HttpServletRequest request);
    /**
     *17实名验证
     */
    @RequestMapping(value ="/a/u/real-name", produces="application/json",method = RequestMethod.POST)
     JSONObject realName(@RequestParam(value = "realName",required = false)String realName,@RequestParam(value = "idCard",required = false)String idCard,@RequestParam(value = "bankCard",required = false)String bankCard
    ,@RequestParam(value = "request",required = false)HttpServletRequest request);
    /**
     *20需要短信验证（更换手机时）
     */
    @RequestMapping(value ="/a/u/sms-code", produces="application/json",method = RequestMethod.GET)
     JSONObject smsCode(@RequestParam(value = "request",required = false)HttpServletRequest request);


    /**
     *23更换手机
     */
    @RequestMapping(value ="/a/u/new-phone-number", produces="application/json",method = RequestMethod.PUT)
     JSONObject newPhone( @RequestParam(value = "request",required = false)HttpServletRequest request,@RequestParam(value = "phoneNumber",required = false)String phoneNumber, @RequestParam(value = "smsCode",required = false)Long smsCode);
    /**
     *24修改密码
     */
    @RequestMapping(value ="/a/u/new-password", produces="application/json",method = RequestMethod.PUT)
     JSONObject newPassword(@RequestParam(value = "lastPassword",required = false)String lastPassword,@RequestParam(value = "newPassword1",required = false)String newPassword1,@RequestParam(value = "newPassword2",required = false)String newPassword2
    ,@RequestParam(value = "request",required = false)HttpServletRequest request);
    /**
     *26消息中心
     */
    @RequestMapping(value ="/a/u/information-center", produces="application/json",method = RequestMethod.GET)

     JSONObject informationCenter(@RequestParam(value = "request",required = false)HttpServletRequest request,@RequestParam(value = "size",required = false)Long size ,@RequestParam(value = "count",required = false)Long count);
    /**
     *27消息阅读
     */
    @RequestMapping(value ="/a/u/information", produces="application/json",method = RequestMethod.GET)
     JSONObject information(@RequestParam(value = "request",required = false)HttpServletRequest request,@RequestParam(value = "id",required = false)Long  id);
    /**
     *26消息中心(用户建议)
     */
    @RequestMapping(value ="/a/u/sugge-center", produces="application/json",method = RequestMethod.GET)
    JSONObject suggeCenter(@RequestParam(value = "request",required = false)HttpServletRequest request,@RequestParam(value = "size",required = false)Long size ,@RequestParam(value = "count",required = false)Long count);
    /**
     *27消息阅读(用户建议)
     */
    @RequestMapping(value ="/a/u/sugge", produces="application/json",method = RequestMethod.GET)
    JSONObject sugge(@RequestParam(value = "id",required = false)Long  id);

}


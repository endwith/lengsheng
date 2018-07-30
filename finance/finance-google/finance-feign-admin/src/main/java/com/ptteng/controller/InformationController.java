package com.ptteng.controller;

import com.alibaba.fastjson.JSONObject;
import com.ptteng.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;


@RefreshScope
@RestController
public class InformationController {
    @Autowired
    InformationService informationService;

    /**
     *84消息管理入口
     */
    @RequestMapping(value ="/a/u/all-information", produces="application/json",method = RequestMethod.GET)
    public JSONObject getAllInformation(Long page,Long size){
        return informationService.getAllInformation(page,size);
    }
    /**
     *85消息管理查询
     */
    @RequestMapping(value ="/a/u/information", produces="application/json",method = RequestMethod.GET)
    public JSONObject getInformation(Long page,Long size,String inforTitle,
                                     Integer inforStatus,
                                     String founder,Long sendBeginTime,
                                     Long sendEndTime){
        return informationService.getInformation(page,size,inforTitle,inforStatus,founder,sendBeginTime,sendEndTime);
    }
    /**
     *86消息管理新增
     */
    @RequestMapping(value ="/a/u/information", produces="application/json",method = RequestMethod.POST)
    public JSONObject addInformation(String inforTitle,
                                     String inforPicture,
                                     String inforContent,
                                     Long sendTime,
                                     Integer inforStatus,HttpServletRequest request){
        return informationService.addInformation(inforTitle,inforPicture,inforContent,sendTime,
                inforStatus,request);
    }
    /**
     *87消息管理编辑-获取
     *90消息管理查看详情
     */
    @RequestMapping(value ="/a/u/information/{id}", produces="application/json",method = RequestMethod.GET)
    public JSONObject getInformationById(Long id){
        return informationService.getInformationById(id);
    }
    /**
     *88消息管理编辑-更改
     *89消息管理取消推送
     */
    @RequestMapping(value ="/a/u/information/{id}", produces="application/json",method = RequestMethod.PUT)
    public JSONObject updateInformation(Long id,String inforTitle, String inforPicture,String inforContent,Long sendTime,
                                        Integer inforStatus, HttpServletRequest request){
        return informationService.updateInformation(id,inforTitle,inforPicture,inforContent,sendTime,inforStatus,request);
    }
    /**
     *91消息管理删除
     */
    @RequestMapping(value ="/a/u/information/{id}", produces="application/json",method = RequestMethod.DELETE)
    public JSONObject deleteInformation(Long id){
        return informationService.deleteInformation(id);
    }


}

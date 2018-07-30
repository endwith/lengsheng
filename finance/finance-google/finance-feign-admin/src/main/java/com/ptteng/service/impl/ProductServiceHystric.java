package com.ptteng.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ptteng.model.Product;
import com.ptteng.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

@Component
public class ProductServiceHystric implements ProductService {
    @Autowired
    private JSONObject jsonObject;

    @Override
    public JSONObject getAllProduct(Long page, Long size) {
        jsonObject.put("code",2002);
        jsonObject.put("data","");
        return  jsonObject;
    }

    @Override
    public JSONObject getProducts(Long page, Long size, Long id, String productName, String founder, Integer status) {
        jsonObject.put("code",2002);
        jsonObject.put("data","");
        return  jsonObject;
    }

    @Override
    public JSONObject addProduct(String productName, BigDecimal expectedRate, Integer investmentCycle,
                                 BigDecimal originMoney, BigDecimal addMoney, Integer returnInterest, String introduce,
                                 String moreInformation,HttpServletRequest request) {
        jsonObject.put("code", 2002);
        jsonObject.put("data", "");
        return jsonObject;
    }
    @Override
    public JSONObject getProduct(Long id) {
            jsonObject.put("code",2002);
            jsonObject.put("data","");
            return  jsonObject;
    }

    @Override
    public JSONObject updateProduct(Long id, String productName, BigDecimal expectedRate,
                                    Integer investmenCycle, BigDecimal originMoney, BigDecimal addMoney,
                                    Integer returnInterest, String introduce, String moreInformation, Integer status, HttpServletRequest request) {
        jsonObject.put("code",2002);
        jsonObject.put("data","");
        return  jsonObject;
    }

    @Override
    public JSONObject deleteProduct(Long id) {
        jsonObject.put("code",2002);
        jsonObject.put("data","");
        return  jsonObject;
    }
}

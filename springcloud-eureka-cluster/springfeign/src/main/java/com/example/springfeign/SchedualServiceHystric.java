package com.example.springfeign;

import org.springframework.stereotype.Component;
//熔断器的实现类
@Component
public class SchedualServiceHystric implements SchedualService {
    @Override
    public String FromClient() {
        return "sorry,连接断开";
    }
}
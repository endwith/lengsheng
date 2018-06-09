package com.longhang.userHandler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebAppConfigurer  extends WebMvcConfigurerAdapter {
@Bean
public UserLonginHandler userLonginHandler(){
    return new UserLonginHandler();
}
@Bean
public UserRegistHandler userRegistHandler(){
    return new UserRegistHandler();
}
@Bean
public UserRoleHandler userRoleHandler(){
    return new UserRoleHandler();
}

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(userLonginHandler()).addPathPatterns("/logins");
        registry.addInterceptor(userRegistHandler()).addPathPatterns("/regist");
        registry.addInterceptor(userRoleHandler()).addPathPatterns("/u/**");
        super.addInterceptors(registry);
    }

}
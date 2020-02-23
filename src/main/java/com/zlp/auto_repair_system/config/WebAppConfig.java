package com.zlp.auto_repair_system.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Author: zlp
 * Date: 2020-02-15 15:40
 * Description:注册拦截器
 */
@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //设置拦截的路径，不拦截的路径，优先级等等
//        registry.addInterceptor(new SessionInterceptor()).excludePathPatterns("/login");
//    }
}

package com.offcn.springbootdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Song Ziliang
 * @email s13008212144    @163.com
 * @date 2020/5/10
 */
/*@Configuration*/
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将所有D:\\springboot\\pic\\ 访问都映射到/myPic/** 路径下
        registry.addResourceHandler("/mypic/**").addResourceLocations("file:E:\\upload\\");
    }
}

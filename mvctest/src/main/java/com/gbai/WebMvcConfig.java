package com.gbai;

import com.gbai.controller.IndexController;
import com.gbai.resolver.CustomerArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * @program: mvctest
 * @description:
 * @author: gbai
 * @create: 2018-07-18 14:29
 **/
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    /**
     * 添加参数装载
     * @param argumentResolvers
     */

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        /**
         * 将自定义的参数装载添加到spring内托管
         */
        argumentResolvers.add(new CustomerArgumentResolver());
    }

    /**
     * 配置静态请求视图映射
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }
}

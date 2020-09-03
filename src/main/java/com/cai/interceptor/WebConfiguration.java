package com.cai.interceptor;

import com.cai.entity.Navbar;
import com.cai.service.NavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {

    @Autowired
    private NavService navService;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        List list = new ArrayList();
        list.add("/*");
        registry.addInterceptor(new Interceptor(navService)).addPathPatterns(list);
    }





}

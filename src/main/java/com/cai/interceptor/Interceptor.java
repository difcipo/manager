package com.cai.interceptor;

import com.cai.entity.Navbar;
import com.cai.service.NavService;
import com.cai.service.imp.NavServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class Interceptor implements HandlerInterceptor{

    @Autowired
    private NavService navService;

    public Interceptor(NavService navService){
        this.navService = navService;
    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

        List<Navbar> navList = navService.getNavList();
        request.getSession().setAttribute("navList",navList);
        System.out.println("拦截器");
        return true;
    }


}

package com.cai.controller;

import com.cai.entity.User;
import com.cai.service.UserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.UUID;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public String index(User user, HttpServletRequest request){

        User user1 = userService.getLoginUser(user);
        System.out.println(user1==null);
        if(user1!=null){
            request.getSession().setAttribute("user1",user1);

        }
        return "redirect:/pushList";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession().removeAttribute("user1");
        return "redirect:/pushList";
    }

    @RequestMapping("/toRegister")
    public String register(User user){
//        UUID uuid = UUID.randomUUID();
//        String[] split = uuid.toString().split("-");
//        String s = Arrays.toString(split);
        userService.addUser(user);
        return "redirect:/pushList";
    }

    @RequestMapping("/ajaxUser")
    @ResponseBody
    public String ajaxUser(Model model,String username){
        User user = userService.ajaxUser(username);
        if(user!=null){
            return "success";
        }
        return "false";
    }

}

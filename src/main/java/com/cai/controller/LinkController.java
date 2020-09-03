package com.cai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LinkController {

    @RequestMapping("/tags")
    public String tags(){

        return "tags";
    }
    @RequestMapping("/readers")
    public String readers(){

        return "readers";
    }
}

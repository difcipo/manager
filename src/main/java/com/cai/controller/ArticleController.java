package com.cai.controller;

import com.cai.entity.BLastpush;
import com.cai.service.BLastpushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArticleController {

    @Autowired
    private BLastpushService bLastpushService;

    @RequestMapping("/toArticle")
    public String article(Model model,@RequestParam("id") int id){
        BLastpush push = bLastpushService.getPush(id);
        model.addAttribute("push",push);
        return "article";
    }
}

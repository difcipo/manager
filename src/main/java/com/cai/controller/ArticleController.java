package com.cai.controller;

import com.cai.entity.BLastpush;
import com.cai.entity.Word;
import com.cai.service.BLastpushService;
import com.cai.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class ArticleController {

    @Autowired
    private BLastpushService bLastpushService;
    @Autowired
    private WordService wordService;


    @RequestMapping("/toArticle")
    public String article(Model model,@RequestParam(defaultValue = "1") int currentPage, Map map,@RequestParam("id") int id){
        int pageSize=2;
        int totalSize = bLastpushService.totalTimes();
        int start = (currentPage-1)*pageSize;
        int last = currentPage*pageSize;
        int totalPage = totalSize%pageSize==0?totalSize/pageSize:totalSize/pageSize+1;

        BLastpush push = bLastpushService.getPush(id);
        List<BLastpush> hots = bLastpushService.getHot();
        Word word = wordService.getWord();
        System.out.println(hots.size());
        map.put("push",push);
        map.put("hots",hots);
        map.put("word",word);
        map.put("totalPage",totalPage);
        map.put("currentPage",currentPage);
        model.addAllAttributes(map);
        return "article";
    }
}

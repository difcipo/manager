package com.cai.controller;

import com.cai.entity.*;
import com.cai.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private BLastpushService bLastpushService;

    @Autowired
    private BTodyService bTodyService;
    @Autowired
    private WordService wordService;
    @Autowired
    private NoticeService noticeService;
    @Autowired
    private BannerService bannerService;


    @RequestMapping("/pushList")
    public String getPushList(HttpServletRequest request,Model model, @RequestParam(defaultValue = "1") int currentPage){
        int pageSize=2;
        int totalSize = bLastpushService.totalTimes();
        int start = (currentPage-1)*pageSize;
        int last = currentPage*pageSize;
        int totalPage = totalSize%pageSize==0?totalSize/pageSize:totalSize/pageSize+1;

        List<BLastpush> pushList = bLastpushService.getPushList(start,pageSize);
        System.out.println(" size= "+pushList.size());


        BTody tody = bTodyService.getTody();
        Word word = wordService.getWord();
        List<Notice> notices = noticeService.getNotices();
        List<BLastpush> hots = bLastpushService.getHot();
        List<Banner> banners = bannerService.getBanner();

        model.addAttribute("pushList",pushList);

        model.addAttribute("tody",tody);
        model.addAttribute("word",word);
        model.addAttribute("notices",notices);
        model.addAttribute("hots",hots);
        Map map = new HashMap();

        map.put("totalPage",totalPage);
        map.put("currentPage",currentPage);
        map.put("banners",banners);
        model.addAllAttributes(map);
        request.getSession().setAttribute("index",1);
        return "index";
    }
}

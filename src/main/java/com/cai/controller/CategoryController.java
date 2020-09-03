package com.cai.controller;

import com.cai.entity.BLastpush;
import com.cai.service.BLastpushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class CategoryController {

    @Autowired
    private BLastpushService bLastpushService;

    //index是用来判断是前端还是后端
    @RequestMapping("/toCategory")
    public String category(Model model,Map map,@RequestParam(defaultValue = "1") int currentPage,  @RequestParam("index") int index){
        int totalSize = bLastpushService.getTotalSizeCol(index);
        int pageSize=2;
        int start = (currentPage-1)*pageSize;

        //该技术相关文章
        List<BLastpush> pushList=null;
        if(index!=1){
            pushList = bLastpushService.getPushByColumn(index);
        }else if(index==1){
            totalSize = bLastpushService.totalTimes();
            pushList = bLastpushService.getPushList(start,pageSize);
        }

        int totalPage = totalSize%pageSize==0?totalSize/pageSize:totalSize/pageSize+1;
        //热门文章
        List<BLastpush> hots = bLastpushService.getHot();

        map.put("pushList",pushList);
        map.put("totalPage",totalPage);
        map.put("currentPage",currentPage);
        map.put("hots",hots);
        model.addAllAttributes(map);
        return "category";
    }
}

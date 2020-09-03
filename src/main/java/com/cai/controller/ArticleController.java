package com.cai.controller;

import com.cai.entity.BLastpush;
import com.cai.entity.Comment;
import com.cai.entity.User;
import com.cai.entity.Word;
import com.cai.service.BLastpushService;
import com.cai.service.CommentService;
import com.cai.service.WordService;
import com.cai.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class ArticleController {

    @Autowired
    private BLastpushService bLastpushService;
    @Autowired
    private WordService wordService;

    @Autowired
    private CommentService commentService;


    @RequestMapping("/toArticle") //参数id时当前文章的id
    public String article(Model model,@RequestParam(defaultValue = "1") int currentPage, Map map,@RequestParam("id") int id){
        BLastpush push = bLastpushService.getPush(id);
        List<BLastpush> hots = bLastpushService.getHot();
        Word word = wordService.getWord();
        List<Comment> commentList = commentService.getCommentList(id);

        map.put("push",push);
        map.put("hots",hots);
        map.put("word",word);
        //map.put("totalTime",totalTime);
        map.put("currentPage",currentPage);
        map.put("commentList",commentList);
        //map.put("counts",counts);
        map.put("id",id);
        model.addAllAttributes(map);
        return "article";
    }

    //id 是用户id
    @RequestMapping("/toComment")
    public String comment(@RequestParam("id") int id, Comment comment, HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user1");
        comment.setUserid(user.getUid());
        String date = Utils.getDate("YYYY-mm-dd HH:MM:SS");
        comment.setTime(date);
        comment.setArticleid(id);
        commentService.addComment(comment);
        return "redirect:/toArticle?id="+id;
    }

    @GetMapping("/ajax")
    @ResponseBody
    public ModelAndView ajax(@RequestParam(defaultValue = "1") int currentPage, Map map, @RequestParam("id") int id){
        ModelAndView model = new ModelAndView();
        int pageSize=2;
        int counts = commentService.getCommentCount(id); //当前文章评论总条数
        int start = (currentPage-1)*pageSize;
        int last = currentPage*pageSize;
        int totalTime = counts%pageSize==0?counts/pageSize:counts/pageSize+1;
        List<Comment> commentList = commentService.getCommentList(id);
        BLastpush push = bLastpushService.getPush(id);
        Word word = wordService.getWord();
        map.put("totalTime",totalTime);
        map.put("currentPage",currentPage);
        map.put("commentList",commentList);
        map.put("counts",counts);
        map.put("id",id);
        map.put("push",push);
        map.put("word",word);
        model.addAllObjects(map);
        //model.setViewName("succecc");
        return model;
    }
}

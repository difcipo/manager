package com.cai.service.imp;

import com.cai.entity.Comment;
import com.cai.mapper.CommentMapper;
import com.cai.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImp implements CommentService{

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public int getCommentCount(int id) {
        return commentMapper.getCommentCount(id);
    }

    @Override
    public List<Comment> getCommentList(int id) {
        return commentMapper.getCommentList(id);
    }

    @Override
    public void addComment(Comment comment) {
        commentMapper.addComment(comment);
    }
}

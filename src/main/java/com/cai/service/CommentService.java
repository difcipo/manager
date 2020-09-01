package com.cai.service;

import com.cai.entity.Comment;

import java.util.List;

public interface CommentService {
    int getCommentCount();

    List<Comment> getCommentList();
}

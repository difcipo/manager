package com.cai.service;

import com.cai.entity.Comment;

import java.util.List;

public interface CommentService {
    int getCommentCount(int id);

    List<Comment> getCommentList(int id);

    void addComment(Comment comment);
}

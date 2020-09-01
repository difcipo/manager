package com.cai.mapper;

import com.cai.entity.Comment;

import java.util.List;

public interface CommentMapper {

    int getCommentCount();

    List<Comment> getCommentList();
}

package com.cai.mapper;

import com.cai.entity.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMapper {

    int getCommentCount(@Param("id") int id);

    List<Comment> getCommentList(@Param("id") int id);

    void addComment(@Param("comment") Comment comment);


}

package com.cai.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private int id;
    private String comment;
    private String time;
    private String expression;
    private int userid;
    private int articleid;
    private User user;
//    private String userName;
//    private String addr;
//    private String headimg;
}

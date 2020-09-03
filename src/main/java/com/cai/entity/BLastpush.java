package com.cai.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BLastpush {
    private int id;
    private String title;
    private int col;
    private String time;
    private int count;
    private String content;
    private String desc;
    private String url;
    private String img;
    private String noview;
    private int hot;
    private String from;
    private String flag;
    private String banner;

}

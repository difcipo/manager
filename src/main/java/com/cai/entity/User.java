package com.cai.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int uid;
    private String userName;
    private String password;
    private String addr;
    private String regtime;
    private String headimg;
}

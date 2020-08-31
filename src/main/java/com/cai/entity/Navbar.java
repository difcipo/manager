package com.cai.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Navbar {
    private int id;
    private String navName;
    private String tarurl;
}

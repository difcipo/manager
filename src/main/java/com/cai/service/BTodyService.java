package com.cai.service;

import com.cai.entity.BTody;
import org.springframework.lang.Nullable;

import java.util.List;

public interface BTodyService  {

    BTody getTody();

    List<BTody> getTodyList();

    int delTodyr(int id);

    int updateTody(BTody bt);

    int addTody(BTody bt);
}

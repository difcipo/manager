package com.cai.mapper;

import com.cai.entity.BTody;
import com.cai.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface TodyMapper {
    BTody getTody(int id);

    List<BTody> getTodyList();

    int delTodyr(int id);

    int updateTody(BTody bt);

    int addTody(BTody bt);
}

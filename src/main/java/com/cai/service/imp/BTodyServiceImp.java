package com.cai.service.imp;

import com.cai.entity.BTody;
import com.cai.mapper.TodyMapper;
import com.cai.service.BTodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BTodyServiceImp implements BTodyService {

    @Autowired
    private TodyMapper todyMapper;

    @Override
    public BTody getTody() {
        return todyMapper.getTody(1);
    }

    @Override
    public List<BTody> getTodyList() {
        return null;
    }

    @Override
    public int delTodyr(int id) {
        return 0;
    }

    @Override
    public int updateTody(BTody bt) {
        return 0;
    }

    @Override
    public int addTody(BTody bt) {
        return 0;
    }
}

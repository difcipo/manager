package com.cai.service.imp;

import com.cai.entity.BLastpush;
import com.cai.mapper.LastpushMapper;
import com.cai.service.BLastpushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BLastpushSeviceImp implements BLastpushService {


    @Autowired
    private LastpushMapper lastpushMapper;

    @Override
    public BLastpush getPush(int id) {

        return lastpushMapper.getPush(id);
    }

    @Override
    public List<BLastpush> getPushList(int start,int end) {

        return lastpushMapper.getPushList(start,end);
    }

    @Override
    public int delPush(int id) {
        return lastpushMapper.delPush(id);
    }

    @Override
    public int updatePush(BLastpush p) {
        return lastpushMapper.updatePush(p);
    }

    @Override
    public int addPush(BLastpush p) {
        return lastpushMapper.addPush(p);
    }

    @Override
    public int totalTimes() {
        return lastpushMapper.totalTimes();
    }

    @Override
    public List<BLastpush> getHot() {
        return lastpushMapper.getHot();
    }

    @Override
    public List<BLastpush> getPushByColumn(int id) {
        return lastpushMapper.getPushByColumn(id);
    }

    @Override
    public int getTotalSizeCol(int id) {
        return lastpushMapper.getTotalSizeCol(id);
    }
}

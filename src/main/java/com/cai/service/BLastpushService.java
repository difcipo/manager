package com.cai.service;

import com.cai.entity.BLastpush;

import java.util.List;

public interface BLastpushService {
    BLastpush getPush(int id);

    List<BLastpush> getPushList(int start,int end);

    int delPush(int id);

    int updatePush(BLastpush p);

    int addPush(BLastpush p);

    int totalTimes();

    List<BLastpush> getHot();
}

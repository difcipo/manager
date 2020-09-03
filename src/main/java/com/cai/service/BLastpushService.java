package com.cai.service;

import com.cai.entity.BLastpush;

import java.util.List;
import java.util.concurrent.BlockingDeque;

public interface BLastpushService {
    BLastpush getPush(int id);

    List<BLastpush> getPushList(int start,int end);

    int delPush(int id);

    int updatePush(BLastpush p);

    int addPush(BLastpush p);

    int totalTimes();

    List<BLastpush> getHot();

    List<BLastpush> getPushByColumn(int id);

    int getTotalSizeCol(int id);
}

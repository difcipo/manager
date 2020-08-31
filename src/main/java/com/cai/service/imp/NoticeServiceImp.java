package com.cai.service.imp;

import com.cai.entity.Notice;
import com.cai.mapper.NoticeMapper;
import com.cai.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImp implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> getNotices() {
        return noticeMapper.getNotices();
    }
}

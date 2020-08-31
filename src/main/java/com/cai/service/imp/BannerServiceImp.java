package com.cai.service.imp;

import com.cai.entity.Banner;
import com.cai.mapper.BannerMapper;
import com.cai.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImp implements BannerService{

    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public List<Banner> getBanner() {
        return bannerMapper.getBanner();
    }
}

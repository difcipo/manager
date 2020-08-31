package com.cai.service.imp;

import com.cai.entity.Navbar;
import com.cai.mapper.NavMapper;
import com.cai.service.NavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NavServiceImp implements NavService {

    @Autowired
    private NavMapper navMapper;

    @Override
    public Navbar getNav(int id) {
        return null;
    }

    @Override
    public List<Navbar> getNavList() {
        return navMapper.getNavList();
    }

    @Override
    public int delNav(int id) {
        return 0;
    }

    @Override
    public int updateNav(Navbar nav) {
        return 0;
    }

    @Override
    public int addNav(Navbar nav) {
        return 0;
    }
}

package com.cai.service;

import com.cai.entity.BLastpush;
import com.cai.entity.Navbar;

import java.util.List;

public interface NavService {
    Navbar getNav(int id);

    List<Navbar> getNavList();

    int delNav(int id);

    int updateNav(Navbar nav);

    int addNav(Navbar nav);
}

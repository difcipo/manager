package com.cai.mapper;

import com.cai.entity.BLastpush;
import com.cai.entity.Navbar;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NavMapper {
    Navbar getNav(int id);

    List<Navbar> getNavList();

    int delNav(int id);

    int updateNav(Navbar nav);

    int addNav(Navbar nav);
}

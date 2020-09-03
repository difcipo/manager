package com.cai.service;

import com.cai.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    User getUser(int id);

    User getLoginUser(User user);

    List<User> getUserList();

    int delUser(int id);

    int updateUser(User user);

    int addUser(User user);

    User ajaxUser(String username);
}

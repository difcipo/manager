package com.cai.mapper;

import com.cai.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
    User getUser(int id);

    User getLoginUser(@Param("user") User user);

    List<User> getUserList();

    int delUser(int id);

    int updateUser(User user);

    int addUser(@Param("user") User user);

    User ajaxUser(@Param("username") String username);
}

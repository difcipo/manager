package com.cai.service.imp;

import com.cai.entity.User;
import com.cai.mapper.UserMapper;
import com.cai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(int id) {

        return userMapper.getUser(id);
    }

    @Override
    public User getLoginUser(User user) {
        System.out.println("进入serviceimp");
        return userMapper.getLoginUser(user);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public int delUser(int id) {
        return userMapper.delUser(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int addUser(User user) {

        return userMapper.addUser(user);
    }

    @Override
    public User ajaxUser(String username) {
        return userMapper.ajaxUser(username);
    }
}

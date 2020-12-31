package com.itheima.mybatis_plus_springboot.service.impl;

import com.itheima.mybatis_plus_springboot.domain.User;
import com.itheima.mybatis_plus_springboot.mapper.UserMapper;
import com.itheima.mybatis_plus_springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findById(Serializable id) {
        return userMapper.selectById(id);
    }
}

package com.itheima.mybatis_plus_springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mybatis_plus_springboot.domain.User;
import com.itheima.mybatis_plus_springboot.mapper.UserMapper;
import com.itheima.mybatis_plus_springboot.service.Plus_UserService;
import org.springframework.stereotype.Service;

@Service
public class Plus_UserServiceImpl extends ServiceImpl<UserMapper, User> implements Plus_UserService {
}

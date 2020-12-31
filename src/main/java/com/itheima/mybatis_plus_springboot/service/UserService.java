package com.itheima.mybatis_plus_springboot.service;

import com.itheima.mybatis_plus_springboot.domain.User;

import java.io.Serializable;

//老Service层写法
public interface UserService {
    User findById(Serializable id);

}

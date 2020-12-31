package com.itheima.mybatis_plus_springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheima.mybatis_plus_springboot.domain.User;
import com.itheima.mybatis_plus_springboot.service.Plus_UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringRunner.class)
class Plus_UserServiceImplTest {
    @Autowired
    private Plus_UserService plusUserService;
    @Test
    public void findById(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("id",3);
        User user = plusUserService.getOne(wrapper);
        System.out.println(user);
    }
}
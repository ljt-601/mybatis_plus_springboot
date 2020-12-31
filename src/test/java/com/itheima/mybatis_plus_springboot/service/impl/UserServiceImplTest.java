package com.itheima.mybatis_plus_springboot.service.impl;

import com.itheima.mybatis_plus_springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringRunner.class)
class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    void findById() {
        System.out.println(userService.findById(3));
    }
}
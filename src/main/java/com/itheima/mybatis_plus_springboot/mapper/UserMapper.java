package com.itheima.mybatis_plus_springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.mybatis_plus_springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;

//继承BaseMapper接口，使用其中的CRUD方法
@Mapper
public interface UserMapper extends BaseMapper<User> {

}

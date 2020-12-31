package com.itheima.mybatis_plus_springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.mybatis_plus_springboot.domain.User;

//1.让Service接口继承IService<实体类>
//2.再定义实现类继承ServiceImpl<自定义Mapper，实体类>，再实现自己定义的接口即可
//别忘了加上@Service注解
public interface Plus_UserService extends IService<User> {
}

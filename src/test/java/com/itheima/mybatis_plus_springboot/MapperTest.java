package com.itheima.mybatis_plus_springboot;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.mybatis_plus_springboot.domain.User;
import com.itheima.mybatis_plus_springboot.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testWrapper(){
        //创建查询条件构造器
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //设置条件
       wrapper.eq("name", "修改后").or()
               .in("name","Jone","Jack").or().lt("age",24);
        List<User> users = userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    //为了消除代码中的硬编码,用Lambda表达式
    @Test
    public void testLambdaWrapper(){
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getName,"Tom").or().isNotNull(User::getEmail);
        int current=2;
        int size=2;
        IPage<User> page = new Page<>(current,size);

        userMapper.selectPage(page, wrapper);
        System.out.println("========================================================");
        System.out.println(page.getPages());   //总页数
        System.out.println(page.getCurrent());  //当前页码
        System.out.println(page.getTotal());    //总记录数
        System.out.println(page.getRecords());   //当前页的数据
    }

    //修改用到UpdateWrapper 因为有 独有的set方法
    @Test
    public void testUpdate(){
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.eq("age",66).set("name","哈哈哈");
        userMapper.update(null,wrapper);

    }
}

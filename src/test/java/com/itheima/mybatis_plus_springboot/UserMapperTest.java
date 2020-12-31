package com.itheima.mybatis_plus_springboot;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.mybatis_plus_springboot.domain.User;
import com.itheima.mybatis_plus_springboot.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    //查询单个
    public void testFindById(){
        User user = userMapper.selectById(2L);
        System.out.println(user);
    }
    @Test
    //添加
    public void testInsert(){
        User user = new User();
        //user.setId(6L);
        user.setAge(19);
        user.setName("哈反倒是");
        user.setEmail("@dsjkfhksal");
        System.out.println(userMapper.insert(user));
    }
    @Test
    //删除
    public void testDelete(){
        //根据id删除
        //System.out.println(userMapper.deleteById(9L));

        //根据多个id一次删除多个
/*        ArrayList<Long> longs = new ArrayList<>();
            longs.add(6L);
            longs.add(10L);
        System.out.println(userMapper.deleteBatchIds(longs));*/

        //根据添加进map集合的条件删除
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","哈哈");
        map.put("age",17);
        System.out.println(userMapper.deleteByMap(map));


    }

    //修改
    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(12L);
        user.setName("修改后");
        user.setAge(66);
        user.setEmail("fsadfsdgs");
        System.out.println(userMapper.updateById(user));
    }

    @Test
    //分页查询
    public void testSelectPage(){
        int current=1;
        int size = 2;
        IPage<User> page=new Page(current,size);
        userMapper.selectPage(page, null);

        System.out.println("========================================================");
        System.out.println(page.getPages());   //总页数
        System.out.println(page.getCurrent());  //当前页码
        System.out.println(page.getTotal());    //总记录数
        System.out.println(page.getRecords());   //当前页的数据

    }
}

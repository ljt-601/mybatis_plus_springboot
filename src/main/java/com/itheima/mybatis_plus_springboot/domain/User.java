package com.itheima.mybatis_plus_springboot.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.lang.reflect.Type;

@Data  //自动编写实体类setter,getter，toString等方法
@TableName("user")  //配置实体类名与数据库表名一致，一样的话可以省略括号
public class User {
     @TableId(type = IdType.AUTO)  //1.表示这是一个主键id 2.设置id的生成策略  //AUTO 自增 NONE 用户自己定义
                                                                         //ASSIGN_ID 雪花算法，类型为long能够保证 id 的唯一性（保证分布式情况下，id唯一）
                                                                         //ASSIGN_UUID ,类型为字符串。能够保证 id 的唯一性（保证分布式情况下，id唯一）
     private Long id;
     @TableField("name")  //当数据库的字段名和变量名不一致时配
     private String name;
     private Integer age;
     private String email;

    @TableField(exist = false)  //不希望存入数据库的变量，用这个设置
     private String info;

}

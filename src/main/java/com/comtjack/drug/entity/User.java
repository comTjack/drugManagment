package com.comtjack.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data   //可以为类读写功能，从而不用写get、set方法，同时提供equals/hashcode/toString方法
@TableName(value = "user")  //mybatisPlus中的注解，用来声明对应的数据库中的表的表明
public class User implements Serializable { //实现序列化，使其能作为json结构传给前端
    /*主键*/
    @TableField("id")   //表示对应表中的id字段
    @TableId(value = "id",type = IdType.AUTO)   //value表示表的主键名，AUTO表示自增
    private Integer id;

    /*用户名*/
    private String username;

    /*密码*/
    private String password;

    //写完此实例类之后去mapper下创建UserMapper接口
}

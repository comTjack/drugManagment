package com.comtjack.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.comtjack.drug.entity.User;

/**
 * 用户表的增删改查mapper层
 * 继承了mybatisPlus中的BaseMapper类，此类中已经实现了大量的操纵数据库的方法
 */
public interface UserMapper extends BaseMapper<User> {
    //之后写service，创建IUserService接口
}

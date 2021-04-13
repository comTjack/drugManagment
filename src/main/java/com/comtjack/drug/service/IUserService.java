package com.comtjack.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.comtjack.drug.entity.User;

/**
 * 用户表的service层
 */
public interface IUserService extends IService<User> {
    //根据用户名查询用户对象
    public User queryUserByUsername(User user);

    //创建此接口后创建impl包
}

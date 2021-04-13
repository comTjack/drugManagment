package com.comtjack.drug.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.comtjack.drug.entity.User;
import com.comtjack.drug.mapper.UserMapper;
import com.comtjack.drug.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户service的实现
 */
@Service    //表示是一个service的实现
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired  //避免
    private UserMapper userMapper;  //由于需要引入数据的操作所以创建mapper对象
    @Override
    public User queryUserByUsername(User user) {
        QueryWrapper<User> wrapper = new QueryWrapper();    //QueryWrapper为工具类
        wrapper.eq("username", user.getUsername());
        return userMapper.selectOne(wrapper);   //返回一个对象
    }
}

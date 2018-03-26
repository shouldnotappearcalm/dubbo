package com.gzr.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gzr.domain.User;
import com.gzr.service.UserService;

/**
 * 用户逻辑类实现‘
 *
 * @author GaoZhiRong
 * @create 2018-03-26 22:23
 **/
@Service
public class UserServiceImpl implements UserService{
    @Override
    public User saveUser(User user) {
        user.setId(1);
        System.out.println(user.toString());
        return user;
    }
}

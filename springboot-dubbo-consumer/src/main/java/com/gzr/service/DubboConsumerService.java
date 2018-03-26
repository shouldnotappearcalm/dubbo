package com.gzr.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gzr.domain.User;
import org.springframework.stereotype.Component;

/**
 * @author GaoZhiRong
 * @create 2018-03-26 22:40
 **/
@Component
public class DubboConsumerService {

    @Reference
    private UserService userService;

    public User saveUser() {
        User user = new User();
        user.setUsername("gzr");
        user.setPassword("Aa11223344");
        return userService.saveUser(user);
    }

}

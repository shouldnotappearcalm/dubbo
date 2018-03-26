package com.gzr.controller;

import com.gzr.domain.User;
import com.gzr.service.DubboConsumerService;
import com.gzr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制层
 *
 * @author GaoZhiRong
 * @create 2018-03-26 22:32
 **/
@RestController
public class UserController {

    @Autowired
    private DubboConsumerService dubboConsumerService;

    @RequestMapping("/save")
    public Object saveUser() {

        return dubboConsumerService.saveUser();
    }

}

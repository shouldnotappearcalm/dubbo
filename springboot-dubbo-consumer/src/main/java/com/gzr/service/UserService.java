package com.gzr.service;

import com.gzr.domain.User;

/**
 * 用户类接口，与dubbo相同
 *
 * @author GaoZhiRong
 * @create 2018-03-26 22:31
 **/
public interface UserService {

    User saveUser(User user);

}

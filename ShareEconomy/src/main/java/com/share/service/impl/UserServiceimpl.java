package com.share.service.impl;

import com.share.mapper.UserMapper;
import com.share.pojo.User;
import com.share.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by weixin on 17-7-31.
 */
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(User user) {
        return userMapper.getUserById(user);
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public int SignUp(User user) {
        return userMapper.SignUp(user);
    }

    @Override
    public int UpdateInfo(User user) {
        return userMapper.UpdateInfo(user);
    }

    @Override
    public User CheckUname(User user) {
        return userMapper.CheckUname(user);
    }

    @Override
    public int reCharge(User user) {
        return userMapper.reCharge(user);
    }

    @Override
    public int loginChangeCon(User user) {
        return userMapper.loginChangeCon(user);
    }

}





package com.share.service;

import com.share.pojo.User;

/**
 * Created by weixin on 17-7-31.
 */
public interface UserService {
    public User getUserById(User user);

    public User login(User user);

    public int SignUp(User user);

    public int UpdateInfo(User user);

    public User CheckUname(User user);

    public int reCharge(User user);

    public int loginChangeCon(User user);
}

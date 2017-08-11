package com.share.mapper;

import com.share.pojo.User;

/**
 * Created by weixin on 17-7-31.
 */
public interface UserMapper {
    public User getUserById(String u_id);

    public User login(User user);

    public int SignUp(User user);

    public int UpdateInfo(User user);

    public User CheckUname(User user);
}

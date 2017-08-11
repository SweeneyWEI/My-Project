package org.imp;

import org.pojo.User;

/**
 * Created by wx on 17-4-29.
 */
public interface LoginImp {
    public boolean checkLogin(User user);
    public boolean addUser(User user);
}

package org.service;

import org.imp.LoginImp;
import org.pojo.User;
import org.util.JDBCUtils;

/**
 * Created by wx on 17-4-29.
 */
public class LoginService implements LoginImp {
    @Override
    public boolean checkLogin(User user) {
        Integer res= JDBCUtils.getSingle(user);
        if (res == 1) {
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }
}

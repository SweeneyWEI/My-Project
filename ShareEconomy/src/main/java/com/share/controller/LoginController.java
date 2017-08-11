package com.share.controller;

import com.share.pojo.User;
import com.share.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by weixin on 17-7-31.
 */
@Controller
@RequestMapping("/cd")
public class LoginController {
    private static Logger log=Logger.getLogger(LoginController.class);
    @Autowired
    private UserService userService;
    private User user;
    @RequestMapping(value = "/login.form",method = RequestMethod.POST,produces = "application/json; charset=utf-8")
    public @ResponseBody
    Object getUser(HttpServletRequest request, HttpServletResponse response){
        String username=request.getParameter("username").trim();
        String password=request.getParameter("password").trim();
        user=new User();
        user.setUname(username);
        user.setUpwd(password);
        User res=userService.login(user);

        if(res!=null){
            Cookie cookie = new Cookie("ssid",res.getUid());
            cookie.setPath("/");
            cookie.setMaxAge(60*60*24);
            response.addCookie(cookie);
            log.info(res.toString());
            return "1";
        }
        else{
            log.error(res);
            return "0";
        }
    }

}

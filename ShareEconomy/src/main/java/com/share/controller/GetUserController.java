package com.share.controller;

import com.share.pojo.User;
import com.share.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by weixin on 17-7-31.
 */
@Controller
@RequestMapping("/cd")
public class GetUserController {
    private static Logger log=Logger.getLogger(GetUserController.class);
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/getUser.from",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public @ResponseBody
    String getUser(HttpServletRequest request, HttpServletResponse response){
        User u=userService.getUserById("1");
        log.info(u.toString());
        return u.toString();
    }

}

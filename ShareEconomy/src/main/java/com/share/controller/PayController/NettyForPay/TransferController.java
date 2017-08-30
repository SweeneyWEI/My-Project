package com.share.controller.PayController.NettyForPay;

import com.share.pojo.Bill;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by weixin on 17-8-26.
 */
@Controller
@RequestMapping("/ef")
public class TransferController{
    Bill bill=new Bill();
    private static Logger logger=Logger.getLogger(TransferController.class);
    @RequestMapping(value = "/Paying.from",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public @ResponseBody
    Object transfer(HttpServletRequest request,HttpServletResponse response) throws InterruptedException {
        String time = request.getParameter("time").trim();
        final Cookie[] oCookies = request.getCookies();
//        ExecutorService pool = Executors.newCachedThreadPool();
        new Thread(new ExcecutePay(time,oCookies)).start();

        Double bill1=bill.getBill();
        return bill1;
    }
}

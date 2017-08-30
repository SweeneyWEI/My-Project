package com.share.controller.PayController.NettyForPay;

import com.share.pojo.Bill;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by weixin on 17-8-30.
 */
public class ExcecutePay implements Runnable {
    private String time;
    private Cookie[] oCookies;
    private ExcecutePaying paying;

    public ExcecutePay(String str, Cookie[] cookies) {
//        super(name);
        this.time = str;
        this.oCookies = cookies;
    }
    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName());
        paying=new ExcecutePaying();
        paying.Pay(time,oCookies);
    }
}

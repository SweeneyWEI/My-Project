package com.share.controller.PayController.NettyForPay;

import com.share.pojo.Bill;

import javax.servlet.http.Cookie;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by weixin on 17-8-30.
 */
public class ExcecutePaying {

    private final ReentrantLock Lock = new ReentrantLock();//soft lock

    public void Pay(String str,Cookie[] cookies) {
        Lock.lock();
        try {
            double Bill;
            Bill bill1 = new Bill();

            int hour = Integer.parseInt(str.substring(0, 2));
            int minute = Integer.parseInt(str.substring(3, 5));
            int second = Integer.parseInt(str.substring(6, 8));
//        logger.info(time);
            if (cookies != null) {
                for (final Cookie oItem : cookies) {//calculate the bill.
                    final String sName = oItem.getName();
                    if (sName.equals("Obill")) {
                        Double bill = Double.parseDouble(oItem.getValue());

                        if (minute <= 31) {
                            Bill = bill;
                            if (minute <= 60&&minute>31) {
                                Bill = bill * 2;
                                if (hour > 0) {

                                    bill1.setBill(hour * bill * 2 + Bill);

                                } else
                                    bill1.setBill(Bill);
                            } else
                                bill1.setBill(Bill);
                        }
                    }
                }
            }
        } finally {
            Lock.unlock();
        }
    }
}

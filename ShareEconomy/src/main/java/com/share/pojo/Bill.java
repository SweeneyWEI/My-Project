package com.share.pojo;

/**
 * Created by weixin on 17-8-30.
 */
public class Bill {
    private static Double bill;

    public void setBill(Double bill) {
        this.bill = bill;
        System.out.println(this.getBill());
    }
    public Double getBill() {
        return bill.doubleValue();
    }

}

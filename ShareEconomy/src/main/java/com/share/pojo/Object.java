package com.share.pojo;

/**
 * Created by weixin on 17-8-6.
 */
public class Object {
    private String oid;//产品id
    private String object;//产品类型
    private String amount;//产品数量
    private String price;//每小时计费
    private String condition;//使用状态

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}

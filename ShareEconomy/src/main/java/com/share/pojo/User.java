package com.share.pojo;

/**
 * Created by weixin on 17-7-31.
 */
public class User {
    private String uid;
    private String uname;
    private String upwd;
    private String alias;
    private String umobile;
    private String IDnumber;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUmobile() {
        return umobile;
    }

    public void setUmobile(String umobile) {
        this.umobile = umobile;
    }

    public String getIDnumber() {
        return IDnumber;
    }

    public void setIDnumber(String IDnumber) {
        this.IDnumber = IDnumber;
    }

    @Override
    public String toString() {
        return "User{"+"uid="+uid+'\''+", uname='" + uname + '\'' +
                ", upassword='" + upwd + '\'' +
                ", umobile='" + umobile + '\'' +",IDnumber="+IDnumber+'\''+
                '}';
    }
}

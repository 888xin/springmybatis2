package com.lhx.model;

import java.io.Serializable;

/**
 * Created by lhx on 14-12-22 下午1:56
 *
 * @project springmybatis2
 * @package com.lhx.model
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @Description
 */
public class User implements Serializable {
    private int uid ;
    private String username ;
    private String password ;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "uId: "+this.uid + ", Name: " + this.username + ",Pass: " + this.password;
    }
}

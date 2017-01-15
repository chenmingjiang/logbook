package com.etyy.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by chenmingjiang on 2017/1/15.
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userid;
    //登录用户名
    @NotNull
    private String loginname;
    //用户密码
    @NotNull
    private String password;
    //显示姓名
    @NotNull
    private String displayname;
    //用户权限
    private String Authority ;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getAuthority() {
        return Authority;
    }

    public void setAuthority(String authority) {
        Authority = authority;
    }
}

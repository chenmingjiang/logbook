package com.etyy.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

/**
 * Created by chenmingjiang on 2017/1/14.
 */
@Entity
@Table(name = "logbooks")
public class LogBooks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logbooksid;
    //值班时间
    @NotNull
    private Date ins_data;
    //值班人
    @OneToOne
    @JoinColumn(name = "userid", insertable = false, updatable = false)
    private User zb_user;
    //设备状态
    @NotNull
    private String state;
    //设备温度
    @NotNull
    private int temperature;
    //设备湿度
    @NotNull
    private int humidity;
    //当日汇总
    @NotNull
    private String collect;
    //接班人
    @OneToOne
    @JoinColumn(name = "userid", insertable = false, updatable = false)
    private User jb_user;


    public Date getIns_data() {
        return ins_data;
    }

    public void setIns_data(Date ins_data) {
        this.ins_data = ins_data;
    }

    public Long getLogbooksid() {
        return logbooksid;
    }

    public void setLogbooksid(Long logbooksid) {
        this.logbooksid = logbooksid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getCollect() {
        return collect;
    }

    public void setCollect(String collect) {
        this.collect = collect;
    }

    public User getZb_user() {
        return zb_user;
    }

    public void setZb_user(User zb_user) {
        this.zb_user = zb_user;
    }

    public User getJb_user() {
        return jb_user;
    }

    public void setJb_user(User jb_user) {
        this.jb_user = jb_user;
    }

}

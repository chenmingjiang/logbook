package com.etyy.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by chenmingjiang on 2017/1/14.
 */
@Entity
@Table(name = "problemtype")
public class ProblemType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long priblemtypeid;
    //问题类型名称
    @NotNull
    private String name;
    //是否停用
    private boolean ison;

    public Long getPriblemtypeid() {
        return priblemtypeid;
    }

    public void setPriblemtypeid(Long priblemtypeid) {
        this.priblemtypeid = priblemtypeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIson() {
        return ison;
    }

    public void setIson(boolean ison) {
        this.ison = ison;
    }
}

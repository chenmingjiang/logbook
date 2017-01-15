package com.etyy.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by chenmingjiang on 2017/1/14.
 */
@Entity
@Table(name = "depart")
public class Depart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departid;
    //部门名称
    @NotNull
    private String name;
    //是否停用
    private Boolean ison;

    public Long getDepartid() {
        return departid;
    }

    public void setDepartid(Long departid) {
        this.departid = departid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIson() {
        return ison;
    }

    public void setIson(Boolean ison) {
        this.ison = ison;
    }
}

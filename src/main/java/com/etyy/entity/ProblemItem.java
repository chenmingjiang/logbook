package com.etyy.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

/**
 * Created by chenmingjiang on 2017/1/14.
 */
@Entity
@Table(name = "problemitem")
public class ProblemItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long problemitemid;
    //问题科室id
    @OneToOne
    @JoinColumn(name = "departid")
    @NotNull
    private Depart depart_id;
    //问题时间
    @NotNull
    private Date work_date;
    //问题类型
    @OneToOne
    @JoinColumn(name = "problemtypeid")
    @NotNull
    private ProblemType problemType_name;
    //工作记录内容
    @NotNull
    private String problem;
    //处理人id
    @OneToOne
    @JoinColumn(name = "userid")
    @NotNull
    private User cl_user_id;
    //是否完成
    @NotNull
    private boolean sf_finish;

    public Long getProblemitemid() {
        return problemitemid;
    }

    public void setProblemitemid(Long problemitemid) {
        this.problemitemid = problemitemid;
    }

    public Depart getDepart_id() {
        return depart_id;
    }

    public void setDepart_id(Depart depart_id) {
        this.depart_id = depart_id;
    }

    public Date getWork_date() {
        return work_date;
    }

    public void setWork_date(Date work_date) {
        this.work_date = work_date;
    }

    public ProblemType getProblemType_name() {
        return problemType_name;
    }

    public void setProblemType_name(ProblemType problemType_name) {
        this.problemType_name = problemType_name;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public User getCl_user_id() {
        return cl_user_id;
    }

    public void setCl_user_id(User cl_user_id) {
        this.cl_user_id = cl_user_id;
    }

    public boolean isSf_finish() {
        return sf_finish;
    }

    public void setSf_finish(boolean sf_finish) {
        this.sf_finish = sf_finish;
    }
}

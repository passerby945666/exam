package com.exam.wessm.entity;

/**
 * 历史题目实体类
 */
public class Hq {
    /** 历史题目ID*/
    private  Integer h_Id;
    /** 历史题目编号*/
    private  String h_No;
    /**题目状态*/
    private   Integer status ;
    /**考生分数*/
    private   String h_grade;
    /**考生答案*/
    private   String h_ansewr;

    /**考生id*/
    private   Integer s_id ;
    /**考试id*/
    private   Integer e_id;
    /**考生答案*/
    private  Integer t_id;

    public Hq() {
    }

    public Hq(Integer h_Id, String h_No, Integer status, String h_grade, String h_ansewr, Integer s_id, Integer e_id, Integer t_id) {
        this.h_Id = h_Id;
        this.h_No = h_No;
        this.status = status;
        this.h_grade = h_grade;
        this.h_ansewr = h_ansewr;
        this.s_id = s_id;
        this.e_id = e_id;
        this.t_id = t_id;
    }

    public Integer getH_Id() {
        return h_Id;
    }

    public void setH_Id(Integer h_Id) {
        this.h_Id = h_Id;
    }

    public String getH_No() {
        return h_No;
    }

    public void setH_No(String h_No) {
        this.h_No = h_No;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getH_grade() {
        return h_grade;
    }

    public void setH_grade(String h_grade) {
        this.h_grade = h_grade;
    }

    public String getH_ansewr() {
        return h_ansewr;
    }

    public void setH_ansewr(String h_ansewr) {
        this.h_ansewr = h_ansewr;
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    @Override
    public String toString() {
        return "HQ{" +
                "h_Id=" + h_Id +
                ", h_No='" + h_No + '\'' +
                ", status=" + status +
                ", h_grade='" + h_grade + '\'' +
                ", h_ansewr='" + h_ansewr + '\'' +
                ", s_id=" + s_id +
                ", e_id=" + e_id +
                ", t_id=" + t_id +
                '}';
    }
}

package com.exam.wessm.entity;

import java.util.Date;
import java.util.List;

/**
 * 考试实体类
 */
public class Exam  {
    /** 考试ID*/
    private  Integer e_Id;
    /** 考试编号*/
    private  String e_No;
    /** 名字*/
    private  String e_Name;
    /** 开考时间*/
    private  Date time_begin;
    /** 考试时间*/
    private  String  time_test;
    /** 报名时间*/
    private  Date time_baomin;
    /**报名截止时间 */
    private  Date time_end;
    /** 科目id*/
    private Integer  k_id;
    /** 负责人id*/
    private Integer  m_id;

    public Exam() {
    }

    public Exam(Integer e_Id, String e_No, String e_Name, Date time_begin, String time_test, Date time_baomin, Date time_end, Integer k_id, Integer m_id) {
        this.e_Id = e_Id;
        this.e_No = e_No;
        this.e_Name = e_Name;
        this.time_begin = time_begin;
        this.time_test = time_test;
        this.time_baomin = time_baomin;
        this.time_end = time_end;
        this.k_id = k_id;
        this.m_id = m_id;
    }

    public Integer getE_Id() {
        return e_Id;
    }

    public void setE_Id(Integer e_Id) {
        this.e_Id = e_Id;
    }

    public String getE_No() {
        return e_No;
    }

    public void setE_No(String e_No) {
        this.e_No = e_No;
    }

    public String getE_Name() {
        return e_Name;
    }

    public void setE_Name(String e_Name) {
        this.e_Name = e_Name;
    }

    public Date getTime_begin() {
        return time_begin;
    }

    public void setTime_begin(Date time_begin) {
        this.time_begin = time_begin;
    }

    public String getTime_test() {
        return time_test;
    }

    public void setTime_test(String time_test) {
        this.time_test = time_test;
    }

    public Date getTime_baomin() {
        return time_baomin;
    }

    public void setTime_baomin(Date time_baomin) {
        this.time_baomin = time_baomin;
    }

    public Date getTime_end() {
        return time_end;
    }

    public void setTime_end(Date time_end) {
        this.time_end = time_end;
    }

    public Integer getK_id() {
        return k_id;
    }

    public void setK_id(Integer k_id) {
        this.k_id = k_id;
    }

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "e_Id=" + e_Id +
                ", e_No='" + e_No + '\'' +
                ", e_Name='" + e_Name + '\'' +
                ", time_begin=" + time_begin +
                ", time_test='" + time_test + '\'' +
                ", time_baomin=" + time_baomin +
                ", time_end=" + time_end +
                ", k_id=" + k_id +
                ", m_id=" + m_id +
                '}';
    }
}

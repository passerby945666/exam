package com.exam.wessm.entity;

import java.util.Date;

/***
 * 考生信息实体类
 */
public class Student {
    /** 考生ID*/
    private  Integer s_Id;
    /** 考生编号*/
    private  String s_No;
    /** 密码*/
    private   String s_Password;
    /** 考生名字*/
    private  String s_name;
    /** 身份证号码*/
    private  String  s_Idcard;
    /** 性别*/
    private  Integer s_Sex;
    /** 出生年月*/
    private Date s_Birthday;

    public Student(Integer s_Id, String s_No, String s_Password, String s_name, String s_Idcard, Integer s_Sex, Date s_Birthday) {
        this.s_Id = s_Id;
        this.s_No = s_No;
        this.s_Password = s_Password;
        this.s_name = s_name;
        this.s_Idcard = s_Idcard;
        this.s_Sex = s_Sex;
        this.s_Birthday = s_Birthday;
    }

    public Student() {
    }

    public Integer getS_Id() {
        return s_Id;
    }

    public void setS_Id(Integer s_Id) {
        this.s_Id = s_Id;
    }

    public String getS_No() {
        return s_No;
    }

    public void setS_No(String s_No) {
        this.s_No = s_No;
    }

    public String getS_Password() {
        return s_Password;
    }

    public void setS_Password(String s_Password) {
        this.s_Password = s_Password;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_Idcard() {
        return s_Idcard;
    }

    public void setS_Idcard(String s_Idcard) {
        this.s_Idcard = s_Idcard;
    }

    public Integer getS_Sex() {
        return s_Sex;
    }

    public void setS_Sex(Integer s_Sex) {
        this.s_Sex = s_Sex;
    }

    public Date getS_Birthday() {
        return s_Birthday;
    }

    public void setS_Birthday(Date s_Birthday) {
        this.s_Birthday = s_Birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_Id=" + s_Id +
                ", s_No='" + s_No + '\'' +
                ", s_Password='" + s_Password + '\'' +
                ", s_name='" + s_name + '\'' +
                ", s_Idcard='" + s_Idcard + '\'' +
                ", s_Sex=" + s_Sex +
                ", s_Birthday=" + s_Birthday +
                '}';
    }
}

package com.exam.wessm.entity;

import java.util.Date;

/**
 * 管理员实体类
 **/
public class Manager {
    /** 管理员ID*/
    private  Integer m_Id;
    /** 管理员编号*/
    private  String m_No;
    /** 密码*/
    private   String m_password;
    /** 管理员名字*/
    private  String m_Name;
    /** 管理员身份证号码*/
    private  String  m_idcard;
    /** 性别*/
    private  Integer m_sex;
    /** 出生年月*/
    private Date m_birthday;

    public Manager() {
    }

    public Manager(Integer m_Id, String m_No, String m_password, String m_Name, String m_idcard, Integer m_sex, Date m_birthday) {
        this.m_Id = m_Id;
        this.m_No = m_No;
        this.m_password = m_password;
        this.m_Name = m_Name;
        this.m_idcard = m_idcard;
        this.m_sex = m_sex;
        this.m_birthday = m_birthday;
    }

    public Integer getM_Id() {
        return m_Id;
    }

    public void setM_Id(Integer m_Id) {
        this.m_Id = m_Id;
    }

    public String getM_No() {
        return m_No;
    }

    public void setM_No(String m_No) {
        this.m_No = m_No;
    }

    public String getM_password() {
        return m_password;
    }

    public void setM_password(String m_password) {
        this.m_password = m_password;
    }

    public String getM_Name() {
        return m_Name;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }

    public String getM_idcard() {
        return m_idcard;
    }

    public void setM_idcard(String m_idcard) {
        this.m_idcard = m_idcard;
    }

    public Integer getM_sex() {
        return m_sex;
    }

    public void setM_sex(Integer m_sex) {
        this.m_sex = m_sex;
    }

    public Date getM_birthday() {
        return m_birthday;
    }

    public void setM_birthday(Date m_birthday) {
        this.m_birthday = m_birthday;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "m_Id=" + m_Id +
                ", m_No='" + m_No + '\'' +
                ", m_password='" + m_password + '\'' +
                ", m_Name='" + m_Name + '\'' +
                ", m_idcard='" + m_idcard + '\'' +
                ", m_sex=" + m_sex +
                ", m_birthday=" + m_birthday +
                '}';
    }
}

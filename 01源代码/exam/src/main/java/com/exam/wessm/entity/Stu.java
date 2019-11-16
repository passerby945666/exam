package com.exam.wessm.entity;

import java.util.Date;

/***
 * 考生信息实体类
 */
public class Stu {
    /** 考生ID*/
    private  Integer sId;
    /** 考生编号*/
    private  String sNo;
    /** 密码*/
    private   String sPassword;
    /** 考生名字*/
    private  String sName;
    /** 身份证号码*/
    private  String  sIdcard;
    /** 性别*/
    private  Integer sSex;
    /** 出生年月*/
    private Date sBirthday;

    public Stu() {
    }

    public Stu(Integer sId, String sNo, String sPassword, String sName, String sIdcard, Integer sSex, Date sBirthday) {
        this.sId = sId;
        this.sNo = sNo;
        this.sPassword = sPassword;
        this.sName = sName;
        this.sIdcard = sIdcard;
        this.sSex = sSex;
        this.sBirthday = sBirthday;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsIdcard() {
        return sIdcard;
    }

    public void setsIdcard(String sIdcard) {
        this.sIdcard = sIdcard;
    }

    public Integer getsSex() {
        return sSex;
    }

    public void setsSex(Integer sSex) {
        this.sSex = sSex;
    }

    public Date getsBirthday() {
        return sBirthday;
    }

    public void setsBirthday(Date sBirthday) {
        this.sBirthday = sBirthday;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "sId=" + sId +
                ", sNo='" + sNo + '\'' +
                ", sPassword='" + sPassword + '\'' +
                ", sName='" + sName + '\'' +
                ", sIdcard='" + sIdcard + '\'' +
                ", sSex=" + sSex +
                ", sBirthday=" + sBirthday +
                '}';
    }
}

package com.exam.wessm.entity;

import java.util.Date;

/**
 * 管理员实体类
 **/
public class Manager {
    /** 管理员ID*/
    private  Integer mId;
    /** 管理员编号*/
    private  String mNo;
    /** 密码*/
    private   String mPassword;
    /** 管理员名字*/
    private  String mName;
    /** 管理员身份证号码*/
    private  String  mIdcard;
    /** 性别*/
    private  Integer mSex;
    /** 出生年月*/
    private Date mBirthday;

    public Manager() {
    }

    public Manager(Integer mId, String mNo, String mPassword, String mName, String mIdcard, Integer mSex, Date mBirthday) {
        this.mId = mId;
        this.mNo = mNo;
        this.mPassword = mPassword;
        this.mName = mName;
        this.mIdcard = mIdcard;
        this.mSex = mSex;
        this.mBirthday = mBirthday;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmNo() {
        return mNo;
    }

    public void setmNo(String mNo) {
        this.mNo = mNo;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmIdcard() {
        return mIdcard;
    }

    public void setmIdcard(String mIdcard) {
        this.mIdcard = mIdcard;
    }

    public Integer getmSex() {
        return mSex;
    }

    public void setmSex(Integer mSex) {
        this.mSex = mSex;
    }

    public Date getmBirthday() {
        return mBirthday;
    }

    public void setmBirthday(Date mBirthday) {
        this.mBirthday = mBirthday;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mId=" + mId +
                ", mNo='" + mNo + '\'' +
                ", mPassword='" + mPassword + '\'' +
                ", mName='" + mName + '\'' +
                ", mIdcard='" + mIdcard + '\'' +
                ", mSex=" + mSex +
                ", mBirthday=" + mBirthday +
                '}';
    }
}

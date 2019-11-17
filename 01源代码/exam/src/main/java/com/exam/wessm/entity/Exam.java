package com.exam.wessm.entity;

import java.util.Date;
import java.util.List;

/**
 * 考试实体类
 */
public class Exam  {
    /** 考试ID*/
    private  Integer eId;
    /** 考试编号*/
    private  String eNo;
    /** 名字*/
    private  String eName;
    /** 开考时间*/
    private  Date timeBegin;
    /** 考试时间*/
    private  String  timeTest;
    /** 报名时间*/
    private  Date timeBaomin;
    /**报名截止时间 */
    private  Date timeEnd;
    /** 科目id*/
    private Integer  kId;
    /** 负责人id*/
    private Integer  mId;

    public Exam() {
    }

    public Exam(Integer eId, String eNo, String eName, Date timeBegin, String timeTest, Date timeBaomin, Date timeEnd, Integer kId, Integer mId) {
        this.eId = eId;
        this.eNo = eNo;
        this.eName = eName;
        this.timeBegin = timeBegin;
        this.timeTest = timeTest;
        this.timeBaomin = timeBaomin;
        this.timeEnd = timeEnd;
        this.kId = kId;
        this.mId = mId;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteNo() {
        return eNo;
    }

    public void seteNo(String eNo) {
        this.eNo = eNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Date getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(Date timeBegin) {
        this.timeBegin = timeBegin;
    }

    public String getTimeTest() {
        return timeTest;
    }

    public void setTimeTest(String timeTest) {
        this.timeTest = timeTest;
    }

    public Date getTimeBaomin() {
        return timeBaomin;
    }

    public void setTimeBaomin(Date timeBaomin) {
        this.timeBaomin = timeBaomin;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Integer getkId() {
        return kId;
    }

    public void setkId(Integer kId) {
        this.kId = kId;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "eId=" + eId +
                ", eNo='" + eNo + '\'' +
                ", eName='" + eName + '\'' +
                ", timeBegin=" + timeBegin +
                ", timeTest='" + timeTest + '\'' +
                ", timeBaomin=" + timeBaomin +
                ", timeEnd=" + timeEnd +
                ", kId=" + kId +
                ", mId=" + mId +
                '}';
    }
}

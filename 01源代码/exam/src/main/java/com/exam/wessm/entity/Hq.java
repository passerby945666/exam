package com.exam.wessm.entity;

/**
 * 历史题目实体类
 */
public class Hq {
    /** 历史题目ID*/
    private  Integer hId;
    /** 历史题目编号*/
    private  String hNo;
    /**题目状态*/
    private   Integer status ;
    /**考生分数*/
    private   String hGrade;
    /**考生答案*/
    private   String hAnsewr;

    /**考生id*/
    private   Integer sId ;
    /**考试id*/
    private   Integer eId;
    /**考生答案*/
    private  Integer tId;

    public Hq() {
    }

    public Hq(Integer hId, String hNo, Integer status, String hGrade, String hAnsewr, Integer sId, Integer eId, Integer tId) {
        this.hId = hId;
        this.hNo = hNo;
        this.status = status;
        this.hGrade = hGrade;
        this.hAnsewr = hAnsewr;
        this.sId = sId;
        this.eId = eId;
        this.tId = tId;
    }

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String gethNo() {
        return hNo;
    }

    public void sethNo(String hNo) {
        this.hNo = hNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String gethGrade() {
        return hGrade;
    }

    public void sethGrade(String hGrade) {
        this.hGrade = hGrade;
    }

    public String gethAnsewr() {
        return hAnsewr;
    }

    public void sethAnsewr(String hAnsewr) {
        this.hAnsewr = hAnsewr;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    @Override
    public String toString() {
        return "HQ{" +
                "hId=" + hId +
                ", hNo='" + hNo + '\'' +
                ", status=" + status +
                ", hGrade='" + hGrade + '\'' +
                ", hAnsewr='" + hAnsewr + '\'' +
                ", sId=" + sId +
                ", eId=" + eId +
                ", tId=" + tId +
                '}';
    }
}

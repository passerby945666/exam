package com.exam.wessm.entity;

public class Hquestion {
    /**历史题目id**/
    private Integer hId;
    /**历史题目的编号**/
    private String hNo;
    /** 考生ID*/
    private  Integer sId;
    /** 考试ID*/
    private  Integer eId;
    /** 题目ID*/
    private  Integer tId;
    /**题目状态**/
    private Integer Status;
    /**该题的学生历史分数**/
    private String hGrade;
    /**该题的学生历史答案**/
    private String hAnswer;

    public Hquestion() {
    }

    public Hquestion(Integer hId, String hNo, Integer sId, Integer eId, Integer tId, Integer status, String hGrade, String hAnswer) {
        this.hId = hId;
        this.hNo = hNo;
        this.sId = sId;
        this.eId = eId;
        this.tId = tId;
        Status = status;
        this.hGrade = hGrade;
        this.hAnswer = hAnswer;
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

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public String gethGrade() {
        return hGrade;
    }

    public void sethGrade(String hGrade) {
        this.hGrade = hGrade;
    }

    public String gethAnswer() {
        return hAnswer;
    }

    public void sethAnswer(String hAnswer) {
        this.hAnswer = hAnswer;
    }

    @Override
    public String toString() {
        return "Hquestion{" +
                "hId=" + hId +
                ", hNo='" + hNo + '\'' +
                ", sId=" + sId +
                ", eId=" + eId +
                ", tId=" + tId +
                ", Status=" + Status +
                ", hGrade='" + hGrade + '\'' +
                ", hAnswer='" + hAnswer + '\'' +
                '}';
    }
}
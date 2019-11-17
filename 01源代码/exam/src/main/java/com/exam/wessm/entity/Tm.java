package com.exam.wessm.entity;

import java.util.Date;

/**
 * 题目实体类
 */
public class Tm {
    /** 题目ID*/
    private  Integer tId;
    /** 题目编号*/
    private  String tNo;
    /** 题目内容*/
    private   String content;
    /** 题目类型*/
    private  String qType;
    /** 答案*/
    private  String answer;
    /** 解答*/
    private  String reply;
    /** 录入时间*/
    private Date tTime;
    /** 科目*/
    private  Integer kId;

    public Tm() {
    }

    public Tm(Integer tId, String tNo, String content, String qType, String answer, String reply, Date tTime, Integer kId) {
        this.tId = tId;
        this.tNo = tNo;
        this.content = content;
        this.qType = qType;
        this.answer = answer;
        this.reply = reply;
        this.tTime = tTime;
        this.kId = kId;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettNo() {
        return tNo;
    }

    public void settNo(String tNo) {
        this.tNo = tNo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getqType() {
        return qType;
    }

    public void setqType(String qType) {
        this.qType = qType;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public Date gettTime() {
        return tTime;
    }

    public void settTime(Date tTime) {
        this.tTime = tTime;
    }

    public Integer getkId() {
        return kId;
    }

    public void setkId(Integer kId) {
        this.kId = kId;
    }

    @Override
    public String toString() {
        return "Tm{" +
                "tId=" + tId +
                ", tNo='" + tNo + '\'' +
                ", content='" + content + '\'' +
                ", qType='" + qType + '\'' +
                ", answer='" + answer + '\'' +
                ", reply='" + reply + '\'' +
                ", tTime=" + tTime +
                ", kId=" + kId +
                '}';
    }
}

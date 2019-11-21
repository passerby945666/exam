package com.exam.wessm.entity;
/**
 * 题目实体类
 */

import org.apache.ibatis.type.Alias;

import java.util.Date;
@Alias("quebank")
public class Quebank {
    /** 题目ID*/
    private  Integer tId;
    /** 题目编号*/
    private  String tNo;
    /** 题目内容*/
    private   String content;
    /** 题目类型ID*/
    private  Integer qId;
    /** 答案*/
    private  String answer;
    /** 解答*/
    private  String reply;
    /** 录入时间*/
    private Date tTime ;
    /** 科目*/
    private  Integer kId;
    /**题目负责人**/
    private Integer mId;

    public Quebank() {
    }

    public Quebank(Integer tId, String tNo, String content, Integer qId, String answer, String reply, Date tTime, Integer kId, Integer mId) {
        this.tId = tId;
        this.tNo = tNo;
        this.content = content;
        this.qId = qId;
        this.answer = answer;
        this.reply = reply;
        this.tTime = tTime;
        this.kId = kId;
        this.mId = mId;
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

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
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

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    @Override
    public String toString() {
        return "Tm{" +
                "tId=" + tId +
                ", tNo='" + tNo + '\'' +
                ", content='" + content + '\'' +
                ", qId=" + qId +
                ", answer='" + answer + '\'' +
                ", reply='" + reply + '\'' +
                ", tTime=" + tTime +
                ", kId=" + kId +
                ", mId=" + mId +
                '}';
    }
}

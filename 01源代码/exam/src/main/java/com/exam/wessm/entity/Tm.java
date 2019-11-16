package com.exam.wessm.entity;

import java.util.Date;

/**
 * 题目实体类
 */
public class Tm {
    /** 题目ID*/
    private  Integer t_Id;
    /** 题目编号*/
    private  String t_No;
    /** 题目内容*/
    private   String content;
    /** 题目类型*/
    private  String q_type;
    /** 答案*/
    private  String answer;
    /** 解答*/
    private  String reply;
    /** 录入时间*/
    private Date t_time;
    /** 科目*/
    private  Integer k_Id;

    public Tm() {
    }

    public Integer getT_Id() {
        return t_Id;
    }

    public void setT_Id(Integer t_Id) {
        this.t_Id = t_Id;
    }

    public String getT_No() {
        return t_No;
    }

    public void setT_No(String t_No) {
        this.t_No = t_No;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getQ_type() {
        return q_type;
    }

    public void setQ_type(String q_type) {
        this.q_type = q_type;
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

    public Date getT_time() {
        return t_time;
    }

    public void setT_time(Date t_time) {
        this.t_time = t_time;
    }

    public Integer getK_Id() {
        return k_Id;
    }

    public void setK_Id(Integer k_Id) {
        this.k_Id = k_Id;
    }

    public Tm(Integer t_Id, String t_No, String content, String q_type, String answer, String reply, Date t_time, Integer k_Id) {
        this.t_Id = t_Id;
        this.t_No = t_No;
        this.content = content;
        this.q_type = q_type;
        this.answer = answer;
        this.reply = reply;
        this.t_time = t_time;
        this.k_Id = k_Id;
    }

    @Override
    public String toString() {
        return "Tm{" +
                "t_Id=" + t_Id +
                ", t_No='" + t_No + '\'' +
                ", content='" + content + '\'' +
                ", q_type='" + q_type + '\'' +
                ", answer='" + answer + '\'' +
                ", reply='" + reply + '\'' +
                ", t_time=" + t_time +
                ", k_Id=" + k_Id +
                '}';
    }
}

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
}

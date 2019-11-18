package com.exam.wessm.entity;

import org.apache.ibatis.type.Alias;

/**
 * 考试成员实体类
 */
@Alias("examiners")
public class Examiners {
    /** 成员ID*/
    private  Integer exId;
    /** 准考证号*/
    private  String examCard;
    /** 考生id*/
    private  Integer sId;
    /** 考试id*/
    private  Integer eId;

    public Integer getExId() {
        return exId;
    }

    public Examiners(Integer exId, String examCard, Integer sId, Integer eId) {
        this.exId = exId;
        this.examCard = examCard;
        this.sId = sId;
        this.eId = eId;
    }

    public void setExId(Integer exId) {
        this.exId = exId;
    }

    public String getExamCard() {
        return examCard;
    }

    public void setExamCard(String examCard) {
        this.examCard = examCard;
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

    @Override
    public String toString() {
        return "Examiners{" +
                "exId=" + exId +
                ", examCard='" + examCard + '\'' +
                ", sId=" + sId +
                ", eId=" + eId +
                '}';
    }
}

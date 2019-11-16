package com.exam.wessm.entity;

/**
 * 考试成员实体类
 */
public class Examiners {
    /** 成员ID*/
    private  Integer exId;
    /** 准考证号*/
    private  Integer examCard;
    /** 考生id*/
    private  Integer sId;
    /** 考试id*/
    private  Integer eId;

    public Examiners() {
    }

    public Examiners(Integer exId, Integer examCard, Integer sId, Integer eId) {
        this.exId = exId;
        this.examCard = examCard;
        this.sId = sId;
        this.eId = eId;
    }

    public Integer getExId() {
        return exId;
    }

    public void setExId(Integer exId) {
        this.exId = exId;
    }

    public Integer getExamCard() {
        return examCard;
    }

    public void setExamCard(Integer examCard) {
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
                ", examCard=" + examCard +
                ", sId=" + sId +
                ", eId=" + eId +
                '}';
    }
}

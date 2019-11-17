package com.exam.wessm.entity;

/**
 * 考试成员实体类
 */
public class Examiners {
    /** 成员ID*/
<<<<<<< HEAD
    private  Integer ex_Id;
    /** 准考证号*/
    private  Integer zkzh;
    /** 考生id*/
    private  Integer s_id;
    /** 考试id*/
    private  Integer e_id;
=======
    private  Integer exId;
    /** 准考证号*/
    private  Integer examCard;
    /** 考生id*/
    private  Integer sId;
    /** 考试id*/
    private  Integer eId;
>>>>>>> origin/master

    public Examiners() {
    }

<<<<<<< HEAD
    public Examiners(Integer ex_Id, Integer zkzh, Integer s_id, Integer e_id) {
        this.ex_Id = ex_Id;
        this.zkzh = zkzh;
        this.s_id = s_id;
        this.e_id = e_id;
=======
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
>>>>>>> origin/master
    }

    @Override
    public String toString() {
        return "Examiners{" +
<<<<<<< HEAD
                "ex_Id=" + ex_Id +
                ", zkzh=" + zkzh +
                ", s_id=" + s_id +
                ", e_id=" + e_id +
=======
                "exId=" + exId +
                ", examCard=" + examCard +
                ", sId=" + sId +
                ", eId=" + eId +
>>>>>>> origin/master
                '}';
    }
}

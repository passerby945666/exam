package com.exam.wessm.entity;

/**
 * 考试成员实体类
 */
public class Examiners {
    /** 成员ID*/
    private  Integer ex_Id;
    /** 准考证号*/
    private  Integer zkzh;
    /** 考生id*/
    private  Integer s_id;
    /** 考试id*/
    private  Integer e_id;

    public Examiners() {
    }

    public Examiners(Integer ex_Id, Integer zkzh, Integer s_id, Integer e_id) {
        this.ex_Id = ex_Id;
        this.zkzh = zkzh;
        this.s_id = s_id;
        this.e_id = e_id;
    }

    @Override
    public String toString() {
        return "Examiners{" +
                "ex_Id=" + ex_Id +
                ", zkzh=" + zkzh +
                ", s_id=" + s_id +
                ", e_id=" + e_id +
                '}';
    }
}

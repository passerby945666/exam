package com.exam.wessm.entity;
/**
 * 成绩实体类
 */
public class Grades {
    /** 考生ID*/
    private  Integer s_Id;
    /** 考试id*/
    private  Integer e_Id;
    /** 成绩*/
    private   String grade;

    public Grades() {
    }

    public Grades(Integer s_Id, Integer e_Id, String grade) {
        this.s_Id = s_Id;
        this.e_Id = e_Id;
        this.grade = grade;
    }

    public Integer getS_Id() {
        return s_Id;
    }

    public void setS_Id(Integer s_Id) {
        this.s_Id = s_Id;
    }

    public Integer getE_Id() {
        return e_Id;
    }

    public void setE_Id(Integer e_Id) {
        this.e_Id = e_Id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

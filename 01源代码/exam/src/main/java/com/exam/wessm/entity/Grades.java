package com.exam.wessm.entity;
/**
 * 成绩实体类
 */
public class Grades {
    /** 考生ID*/
    private  Integer sId;
    /** 考试id*/
    private  Integer eId;
    /** 成绩*/
    private   String grade;

    public Grades() {
    }

    public Grades(Integer sId, Integer eId, String grade) {
        this.sId = sId;
        this.eId = eId;
        this.grade = grade;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "sId=" + sId +
                ", eId=" + eId +
                ", grade='" + grade + '\'' +
                '}';
    }
}

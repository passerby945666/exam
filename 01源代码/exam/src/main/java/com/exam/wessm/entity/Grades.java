package com.exam.wessm.entity;

import org.apache.ibatis.type.Alias;

/**
 * 成绩实体类
 */
@Alias("grades")
public class Grades {
    /**成绩id**/
    private Integer gId;
    /** 考生ID*/
    private  Integer sId;
    /** 考试id*/
    private  Integer eId;
    /** 成绩*/
    private   String grade;

    public Grades() {
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
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

    public Grades(Integer gId, Integer sId, Integer eId, String grade) {
        this.gId = gId;
        this.sId = sId;
        this.eId = eId;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "gId=" + gId +
                ", sId=" + sId +
                ", eId=" + eId +
                ", grade='" + grade + '\'' +
                '}';
    }
}

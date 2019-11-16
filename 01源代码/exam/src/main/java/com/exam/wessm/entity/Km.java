package com.exam.wessm.entity;

/**
 * 科目实体类
 */
public class Km {
    /** 科目ID*/
    private  Integer k_Id;
    /** 科目编号*/
    private  Integer k_No;
    /** 名称*/
    private   String k_Name;

    public Km(Integer k_Id, Integer k_No, String k_Name) {
        this.k_Id = k_Id;
        this.k_No = k_No;
        this.k_Name = k_Name;
    }

    public Km() {
    }

    public Integer getK_Id() {
        return k_Id;
    }

    public void setK_Id(Integer k_Id) {
        this.k_Id = k_Id;
    }

    public Integer getK_No() {
        return k_No;
    }

    public void setK_No(Integer k_No) {
        this.k_No = k_No;
    }

    public String getK_Name() {
        return k_Name;
    }

    public void setK_Name(String k_Name) {
        this.k_Name = k_Name;
    }

    @Override
    public String toString() {
        return "Km{" +
                "k_Id=" + k_Id +
                ", k_No=" + k_No +
                ", k_Name='" + k_Name + '\'' +
                '}';
    }
}

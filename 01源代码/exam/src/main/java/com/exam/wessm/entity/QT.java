package com.exam.wessm.entity;

public class QT {
    /** 题型ID*/
    private  Integer q_Id;
    /** 类型*/
    private  String q_type;
    /** 分值*/
    private   String q_value;

    public QT() {
    }

    public QT(Integer q_Id, String q_type, String q_value) {
        this.q_Id = q_Id;
        this.q_type = q_type;
        this.q_value = q_value;
    }

    public Integer getQ_Id() {
        return q_Id;
    }

    public void setQ_Id(Integer q_Id) {
        this.q_Id = q_Id;
    }

    public String getQ_type() {
        return q_type;
    }

    public void setQ_type(String q_type) {
        this.q_type = q_type;
    }

    public String getQ_value() {
        return q_value;
    }

    public void setQ_value(String q_value) {
        this.q_value = q_value;
    }

    @Override
    public String toString() {
        return "QT{" +
                "q_Id=" + q_Id +
                ", q_type='" + q_type + '\'' +
                ", q_value='" + q_value + '\'' +
                '}';
    }
}

package com.exam.wessm.entity;

public class Qt {
    /** 题型ID*/
    private  Integer qId;
    /** 类型*/
    private  String qType;
    /** 分值*/
    private   String qValue;

    public Qt() {
    }

    public Qt(Integer qId, String qType, String qValue) {
        this.qId = qId;
        this.qType = qType;
        this.qValue = qValue;
    }

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public String getqType() {
        return qType;
    }

    public void setqType(String qType) {
        this.qType = qType;
    }

    public String getqValue() {
        return qValue;
    }

    public void setqValue(String qValue) {
        this.qValue = qValue;
    }

    @Override
    public String toString() {
        return "QT{" +
                "qId=" + qId +
                ", qType='" + qType + '\'' +
                ", qValue='" + qValue + '\'' +
                '}';
    }
}

package com.exam.wessm.entity;

import org.apache.ibatis.type.Alias;

/**
 * 题型实体类
 */
@Alias("quetype")
public class Quetype {
    /**题型id**/
    private Integer qId;
    /**题型分值**/
    private String qValue;
    /**题目类型**/
    private Integer qType;

    public Quetype() {
    }

    public Quetype(Integer qId, String qValue, Integer qType) {
        this.qId = qId;
        this.qValue = qValue;
        this.qType = qType;
    }

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public String getqValue() {
        return qValue;
    }

    public void setqValue(String qValue) {
        this.qValue = qValue;
    }

    public Integer getqType() {
        return qType;
    }

    public void setqType(Integer qType) {
        this.qType = qType;
    }

    @Override
    public String toString() {
        return "Quetype{" +
                "qId=" + qId +
                ", qValue='" + qValue + '\'' +
                ", qType=" + qType +
                '}';
    }
}
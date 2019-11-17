package com.exam.wessm.entity;

/**
 * 科目实体类
 */
public class Subject {
    /** 科目ID*/
    private  Integer kId;
    /** 科目编号*/
    private  String kNo;
    /** 名称*/
    private   String kName;

    public Subject() {
    }

    public Subject(Integer kId, String kNo, String kName) {
        this.kId = kId;
        this.kNo = kNo;
        this.kName = kName;
    }

    public Integer getkId() {
        return kId;
    }

    public void setkId(Integer kId) {
        this.kId = kId;
    }

    public String getkNo() {
        return kNo;
    }

    public void setkNo(String kNo) {
        this.kNo = kNo;
    }

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName;
    }

    @Override
    public String toString() {
        return "Km{" +
                "kId=" + kId +
                ", kNo=" + kNo +
                ", kName='" + kName + '\'' +
                '}';
    }
}

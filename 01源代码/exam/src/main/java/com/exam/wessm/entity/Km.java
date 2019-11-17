package com.exam.wessm.entity;

/**
 * 科目实体类
 */
public class Km {
    /** 科目ID*/
    private  Integer kId;
    /** 科目编号*/
    private  Integer kNo;
    /** 名称*/
    private   String kName;

    public Km() {
    }

    public Km(Integer kId, Integer kNo, String kName) {
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

    public Integer getkNo() {
        return kNo;
    }

    public void setkNo(Integer kNo) {
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

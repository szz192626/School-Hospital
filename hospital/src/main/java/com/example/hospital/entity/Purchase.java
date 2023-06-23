package com.example.hospital.entity;

public class Purchase {
    private Integer purchaseid ;
    private String purchasename ;
    private String upplier ;
    private String unit ;
    private String  area ;
    private String  type ;
    private Integer number ;

    public Integer getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(Integer purchaseid) {
        this.purchaseid = purchaseid;
    }

    public String getPurchasename() {
        return purchasename;
    }

    public void setPurchasename(String purchasename) {
        this.purchasename = purchasename;
    }

    public String getUpplier() {
        return upplier;
    }

    public void setUpplier(String upplier) {
        this.upplier = upplier;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}

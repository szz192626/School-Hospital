package com.example.hospital.entity;

public class Drugstore {

    private  Integer drugstoreId;
    private  String drugstoreName	;
    private  Integer supplierId;
    private  Integer skullId;

    private  Integer warehouseId;
    private  Integer unit;
    private  double tradePrice;
    private  double sellingPrice;
    private  Integer area;
    private  Integer type ;

    private String produceDate;
    private String  validDate;

    public Integer getDrugstoreId() {
        return drugstoreId;
    }

    public void setDrugstoreId(Integer drugstoreId) {
        this.drugstoreId = drugstoreId;
    }

    public String getDrugstoreName() {
        return drugstoreName;
    }

    public void setDrugstoreName(String drugstoreName) {
        this.drugstoreName = drugstoreName;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getSkullId() {
        return skullId;
    }

    public void setSkullId(Integer skullId) {
        this.skullId = skullId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public double getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(double tradePrice) {
        this.tradePrice = tradePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(String produceDate) {
        this.produceDate = produceDate;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    private  Integer  drugstoreNum	;
    private  String batch	;

    public Integer getDrugstoreNum() {
        return drugstoreNum;
    }

    public void setDrugstoreNum(Integer drugstoreNum) {
        this.drugstoreNum = drugstoreNum;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    private  String supplierName;
    private  String warehouseName;
    private  String skullName;
    private  String unitName;
    private  String areaName;
    private  String typeName;

    //  type表 typeId

    private Integer typeId;
    private Integer unitId;
    private Integer areaId;



    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getSkullName() {
        return skullName;
    }

    public void setSkullName(String skullName) {
        this.skullName = skullName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }
}

package com.example.hospital.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: szz
 * @date: 2023/6/23 18:22
 * @description Pharmary
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pharmacy {
    private Integer pharmacyId;//药品id
    private String pharmacyName;//药品名称
    private Integer drugstoreId;//领货单位外键
    private Integer skullId;//经办人Id
    private Integer warehouseId;//库房Id
    private Integer unit;//库房
    private double sellingPrice;//售价
    private Integer area;//产地
    private Integer type;//类型
    private Date produceDate;//生产日期
    private Date validDate;//保质期
    private Integer drugstorenum;//数量
    private Integer skullbatch;//批号
    private String unitname;//单位名称
}

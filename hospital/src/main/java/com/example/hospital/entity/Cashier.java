package com.example.hospital.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: szz
 * @date: 2023/6/22 16:59
 * @description Cashier
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cashier {
    private int cashier;//处方id
    private  Integer reportId;//挂号id
    private String durgname;//药品名称
    private int durgnum;//药品数量
    private double repiceprice;//价格
    private double repicetotal;//小计
    private Integer state;//状态
    private Integer  ostate;//项目状态
    private String jie;
    private Integer mstate;

}

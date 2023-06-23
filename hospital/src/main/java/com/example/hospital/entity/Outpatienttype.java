package com.example.hospital.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: szz
 * @date: 2023/6/22 17:07
 * @description Outpatienttype
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Outpatienttype {
    private Integer outpatientId;//序号
    private String projectName;//项目名称
    private Integer unit;//单位
    private Integer bigprojectId;//项目分类
    private double price;//价格
    private String unitName;//单位
    private Integer  ostate;//项目状态
}

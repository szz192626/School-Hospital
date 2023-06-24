package com.example.hospital.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: szz
 * @date: 2023/6/23 18:54
 * @description Inoutpatienttype
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Inoutpatienttype {
    private Integer inoutpatientId;
    private String projectName;
    private String pprojectName;
    private double price;
    private Integer bigprojectId;
    private Integer projectId;
    private Integer unit;
    private Integer unitId;
    private String unitName;
}

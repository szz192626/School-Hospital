package com.example.hospital.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: szz
 * @date: 2023/6/23 18:39
 * @description Litem
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Litem {
    Integer inoutpatientId;
    String projectName;
    Integer unitId;
    Integer projectId;
    Double price;
    String unitName;
    String projectNames;

    @Override
    public String toString() {
        return "Litem{" +
                "inoutpatientId=" + inoutpatientId +
                ", projectName='" + projectName + '\'' +
                ", unitId=" + unitId +
                ", projectId=" + projectId +
                ", price=" + price +
                ", unitName='" + unitName + '\'' +
                ", projectNames='" + projectNames + '\'' +
                '}';
    }
}
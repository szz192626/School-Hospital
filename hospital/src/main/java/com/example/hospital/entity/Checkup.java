package com.example.hospital.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: szz
 * @date: 2023/6/26 19:27
 * @description Checkup
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Checkup {
    Integer cid;
    Integer registerid;
    String content;
    @JsonFormat(pattern = "yyyy年MM月dd日",timezone = "GMT+8" )
    Date citme;
    String userName;

    @Override
    public String toString() {
        return "Lcheckup{" +
                "cid=" + cid +
                ", registerid=" + registerid +
                ", content='" + content + '\'' +
                ", citme=" + citme +
                ", userName='" + userName + '\'' +
                '}';
    }
}

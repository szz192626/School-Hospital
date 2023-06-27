package com.example.hospital.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: szz
 * @date: 2023/6/26 19:28
 * @description Pay
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pay {
    int payid;
    int registerid;
    Double money;
    Date payDate;
    String userName;

    @Override
    public String toString() {
        return "Pay{" +
                "payid=" + payid +
                ", registerid=" + registerid +
                ", money=" + money +
                ", payDate=" + payDate +
                ", userName='" + userName + '\'' +
                '}';
    }
}

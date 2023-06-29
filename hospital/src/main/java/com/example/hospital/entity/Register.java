package com.example.hospital.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: szz
 * @date: 2023/6/29 22:32
 * @description Register
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//用户挂号
public class Register {
    Integer registerid;
    String userName;
    Integer age;
    String sex;
    String diagnose;
    String address;
    String phone;
    String idcard;
    @JsonFormat(pattern = "yyyy年MM月dd日", timezone = "GMT+8")
    Date registerDate;
    String operator;
    Double money;
    Integer state;
    Integer departmentId;
    Integer doctorId;
    Integer bedId;
    String department;
    String doctorName;
    String bedName;
    @JsonFormat(pattern = "yyyy年MM月dd日", timezone = "GMT+8")
    Date endDate;
    Double price;
    Double prices;
    String discount;
    Date zhuan;
    Integer reportid;
    Integer day;

    @Override
    public String toString() {
        return "Register{" +
                "registerid=" + registerid +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", diagnose='" + diagnose + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", idcard='" + idcard + '\'' +
                ", registerDate=" + registerDate +
                ", operator='" + operator + '\'' +
                ", money=" + money +
                ", state=" + state +
                ", departmentId=" + departmentId +
                ", doctorId=" + doctorId +
                ", bedId=" + bedId +
                ", department='" + department + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", bedName='" + bedName + '\'' +
                ", endDate=" + endDate +
                ", price=" + price +
                ", prices=" + prices +
                ", discount='" + discount + '\'' +
                ", zhuan=" + zhuan +
                ", reportid=" + reportid +
                ", day=" + day +
                '}';
    }
}
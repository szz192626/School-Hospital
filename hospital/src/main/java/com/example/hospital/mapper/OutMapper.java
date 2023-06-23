package com.example.hospital.mapper;

import com.example.hospital.entity.Cashier;

import java.util.List;

/**
 * @author: szz
 * @date: 2023/6/22 17:10
 * @description OutMapper
 */
public interface OutMapper {

    //查询这个用户的处方表上有没有这个药
    Integer selchuo(Cashier cCashier);
    //添加处方项目
    Integer addchuo(Cashier cCashier);
    //如果有该项目则改变该项目的数量
    Integer updchuo(Cashier cCashier);
    //删除处方中的项目
    Integer delo(Cashier cCashier);
    //查询这个用户的处方的价钱
    Double selch(Cashier cCashier);

}

package com.example.hospital.service;

import com.example.hospital.entity.Cashier;
import com.example.hospital.entity.Outpatienttype;
import com.example.hospital.entity.Pharmacy;
import com.example.hospital.entity.ReportVo;

import java.util.List;

/**
 * @author: szz
 * @date: 2023/6/22 17:16
 * @description OutService
 */
public interface OutService {
    //查询门诊收费项目
    List<Pharmacy> selout(Outpatienttype coutpatienttype);
    //查询这个用户的处方表上有没有这个药
    Integer selchuo(Cashier cCashier);
    //添加处方药品
    Integer addchuo(Cashier cCashier);
    //如果有该项目则改变该项目的数量
    Integer updchuo(Cashier cCashier);
    //删除处方中的项目
    Integer delo(Cashier cCashier);
    //查询这个用户的处方的价钱
    Double selch(Cashier cCashier);
    //修改用户信息付过钱了
    Integer shoufei(ReportVo reportVo);
    //把挂号费添加到收费表上
    Integer guafei(ReportVo reportVo);
}

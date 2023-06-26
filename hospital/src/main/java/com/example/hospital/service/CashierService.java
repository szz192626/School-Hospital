package com.example.hospital.service;

import com.example.hospital.entity.*;

import java.util.List;

public interface CashierService {
    //查询挂号的所有信息用于页面表格展示11
    List<ReportVo> sel();
    //根据药房查询所有药品信息在药品详情框中展示111
    List<Pharmacy> selpharm(Pharmacy pharmacy);
    //查询这个用户的处方表上有没有这个药11
    Integer selcadr(Cashier cashier);
    //添加处方药品
    Integer addchu(Cashier cashier);
    //如果有该药品则改变该药品的数量
    Integer updchu(Cashier cashier);
    //查询该用户的处方
    List<Cashier> selpepi(Integer perid);
    //删除处方中的药品
    Integer del(Cashier cashier);
    //减少药房中的数量
    Integer deldrunum(Pharmacy pharmacy);
    //添加药品数量
    Integer adddrunum(Pharmacy pharmacy);
    //模糊查询
    List<ReportVo> mohu(ReportVo reportVo);
    //修改病例
    Integer addbing(Report report);
    //查询用户有没有病例
    String selbing(Integer rid);
    //查询所有药房
    List<Warehouse> selware();
}

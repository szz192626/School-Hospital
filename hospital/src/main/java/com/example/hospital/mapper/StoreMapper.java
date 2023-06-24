package com.example.hospital.mapper;

import com.example.hospital.entity.*;

import java.util.List;

public interface StoreMapper {

    //查询库房药品
    List<Drugstore> selStore(Drugstore drugstore);
    //查询药品类型
    List <Type> seltype(Type type);
    //供货商
    List <Upplier> selupplier(Upplier upplier);
    //修改药品信息
    int updrugstore(Drugstore drugstore);
    //仓库
    List <Warehouse> selwarehouse(Warehouse warehouse);
    //数量过少的药品查询
    List<Drugstore> selectlackdrug(Drugstore drugstore);
    //库存不足的药品有多少条
    int selcountless();
    //添加采购单
    int addpurchase(Purchase purchase);
    //添加采购单时判断采购单是否已经有同名药品
    int selpurchasename(Purchase purchase);
    //添加采购单时如果已存在此药品 则直接加数量
    int uppurchasenumber(Purchase purchase);

    //查询采购表单
    List<Purchase> selpurchase(Purchase purchase);
    //删除采购单
    int delpurchase(Integer purchaseid);
    //查询过期的药品
    List<Drugstore> seldrugDate(Drugstore drugstore);
    //查询过期的药品有几条
    int selcountlessnum();
    //删除过期药品
    int delexpiredurg(Integer drugstoreId);
}

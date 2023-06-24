package com.example.hospital.service;

import com.example.hospital.entity.Drugstore;
import com.example.hospital.entity.Lack;
import com.example.hospital.entity.YPharmacy;

import java.util.List;

public interface OutinstoreService {
    //查询报缺单
    List<Lack> sellack(Lack lack);
    //根据补给单的名字查询对应的仓库药品
    List<Drugstore>sellackdrugname(Drugstore drugstore);
    //减去库存数量
    int updatedrugnumber(Drugstore drugstore);
    //减去报缺单数量
    int uplacknumber(Drugstore drugstore);
    //库房减去的=加上药房数量
    int uppharmacynumber(Drugstore drugstore);
    //查询库房给出补给时的数量=这条药品的最大数量
    int seldrugnamenum(Drugstore drugstore);
    //查询库房给出补给时的数量=这条药品的最大数量  仓库这批药品全部出库 删除这条
    int deldrugnamenum(Drugstore drugstore);
    //查询报缺表的数据是否有补给完毕的
    int sellacknamenum(Drugstore drugstore);
    //删除报缺数为小于1 的数据
    int dellacknamenum();
    //直接出库添加药品表数据
    int addpharmacy(YPharmacy ypharmacy);
    //出库药品前查询药品是否已存在
    int selpharymacyname(YPharmacy ypharmacy);
    //已经存在则修改则添加数量
    int uppharymacy(YPharmacy ypharmacy);
    //查询报缺表一共有几条数据
    int sellackcount();
    /* 用于判断出库时某种药品时 先看看此药是否在紧急报缺表里面，有的话出库时 报缺表的此药也要随之减少*/
    int sellackName(YPharmacy ypharmacy);
    //修改报缺表对应的药的需求数量
    int uplacknumber1(YPharmacy ypharmacy);
}

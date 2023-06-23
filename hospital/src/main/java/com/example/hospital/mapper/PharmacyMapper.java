package com.example.hospital.mapper;

import com.example.hospital.entity.Lack;
import com.example.hospital.entity.Recovery;
import com.example.hospital.entity.YPharmacy;

import java.util.List;

public interface PharmacyMapper {
    //查询药房药品
    List<YPharmacy> selpharmacy(YPharmacy ypharmacy);

    //库房回收，删除药房药品信息
    int delpharymacy(YPharmacy ypharmacy);
    //回收表
    int addrecovery(Recovery recovery);
    //查询回收表
    List<Recovery>selrecovery(Recovery recovery);
    //删除回收表
    int delrecovery(Recovery recovery);

    //添加药品到报缺表
    int addlack(Lack lack);
    //查询报缺表药品名称是否已存在
    int sellackName(Lack lack);
    //修改数量
    int uplacknum(Lack lack);
}

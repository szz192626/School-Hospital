package com.example.hospital.service;

import com.example.hospital.entity.Recovery;
import com.example.hospital.entity.YPharmacy;

import java.util.List;

public interface PharmacyService {
    //查询药房药品
    List<YPharmacy> selpharmacy(YPharmacy ypharmacy);
    //回收给药房
    int delpharymacy(YPharmacy ypharmacy);
    //回收表
    int addrecovery(Recovery recovery);
    //查询回收表
    List<Recovery>selrecovery(Recovery recovery);
    //删除回收表
    int delrecovery(Recovery recovery);
}

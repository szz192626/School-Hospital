package com.example.hospital.service;

import com.example.hospital.entity.TPharmacy;
import com.example.hospital.entity.Trecord;

import java.util.List;

public interface TdrugService {
    //查询药品信息
    List<TPharmacy> selDrug(TPharmacy tpharmacy);
    //查询患者的药品信息
    List<Trecord> selDrugs(Trecord trecord);
    //添加药品
    int addDrug(Trecord trecord);
    //修改药品信息，时间，数量，价钱
    int updDrug(Trecord trecord);
    //删除患者药品
    int delDrug(Trecord trecord);
    //修改药房数量
    int updDrugs(Trecord trecord);
    //修改药房数量
    int updNum(Trecord trecord);
    //取出药品
    int upd(Trecord trecord);
}

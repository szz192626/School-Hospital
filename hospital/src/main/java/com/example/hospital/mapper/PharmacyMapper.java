package com.example.hospital.mapper;

import com.example.hospital.entity.YPharmacy;

import java.util.List;

public interface PharmacyMapper {
    //查询药房药品
    List<YPharmacy> selpharmacy(YPharmacy ypharmacy);


}

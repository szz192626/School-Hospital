package com.example.hospital.service;

import com.example.hospital.entity.YPharmacy;

import java.util.List;

public interface PharmacyService {
    //查询药房药品
    List<YPharmacy> selpharmacy(YPharmacy ypharmacy);
}

package com.example.hospital.service.Impl;

import com.example.hospital.entity.YPharmacy;
import com.example.hospital.mapper.PharmacyMapper;

import javax.annotation.Resource;
import java.util.List;

public class PharmacyServiceImpl {
    @Resource
    private PharmacyMapper pm;

    public List<YPharmacy> selpharmacy(YPharmacy ypharmacy) {
        return pm.selpharmacy(ypharmacy);
    }
}

package com.example.hospital.service.Impl;

import com.example.hospital.entity.Recovery;
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


    public int delpharymacy(YPharmacy ypharmacy) {
        return pm.delpharymacy(ypharmacy);
    }


    public int addrecovery(Recovery recovery) {
        return pm.addrecovery(recovery);
    }


    public List<Recovery> selrecovery(Recovery recovery) {
        return pm.selrecovery(recovery);
    }


    public int delrecovery(Recovery recovery) {
        return pm.delrecovery(recovery);
    }

}

package com.example.hospital.service.Impl;

import com.example.hospital.entity.Lack;
import com.example.hospital.entity.Recovery;
import com.example.hospital.entity.YPharmacy;
import com.example.hospital.mapper.PharmacyMapper;
import com.example.hospital.service.PharmacyService;

import javax.annotation.Resource;
import java.util.List;

public class PharmacyServiceImpl implements PharmacyService {
    @Resource
    private PharmacyMapper pm;
    @Override
    public List<YPharmacy> selpharmacy(YPharmacy ypharmacy) {
        return pm.selpharmacy(ypharmacy);
    }

    @Override
    public int delpharymacy(YPharmacy ypharmacy) {
        return pm.delpharymacy(ypharmacy);
    }

    @Override
    public int addrecovery(Recovery recovery) {
        return pm.addrecovery(recovery);
    }

    @Override
    public List<Recovery> selrecovery(Recovery recovery) {
        return pm.selrecovery(recovery);
    }

    @Override
    public int delrecovery(Recovery recovery) {
        return pm.delrecovery(recovery);
    }

    @Override
    public int addlack(Lack lack) {
        return pm.addlack(lack);
    }
    @Override
    public int sellackname(Lack lack) {
        return pm.sellackName(lack);
    }
    @Override
    public int uplacknum(Lack lack) {
        return pm.uplacknum(lack);
    }

}

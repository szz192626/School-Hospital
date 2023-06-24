package com.example.hospital.service.Impl;

import com.example.hospital.entity.Drugstore;
import com.example.hospital.entity.Lack;
import com.example.hospital.entity.YPharmacy;
import com.example.hospital.mapper.OutinstoreMapper;
import com.example.hospital.service.OutinstoreService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional
public class OutinstoreServiceImpl implements OutinstoreService {
    @Resource
    private OutinstoreMapper om;
    @Override
    public List<Lack> sellack(Lack lack) {
        return om.sellack(lack);
    }
    @Override
    public List<Drugstore> sellackdrugname(Drugstore drugstore) {
        return om.sellackdrugname(drugstore);
    }

    @Override
    public int updatedrugnumber(Drugstore drugstore) {
        return om.updatedrugnumber(drugstore);
    }

    @Override
    public int uplacknumber(Drugstore drugstore) {
        return om.uplacknumber(drugstore);
    }

    @Override
    public int uppharmacynumber(Drugstore drugstore) {
        return om.uppharmacynumber(drugstore);
    }

    @Override
    public int seldrugnamenum(Drugstore drugstore) {
        return om.seldrugnamenum(drugstore);
    }

    @Override
    public int deldrugnamenum(Drugstore drugstore) {
        return om.deldrugnamenum(drugstore);
    }

    @Override
    public int sellacknamenum(Drugstore drugstore) {
        return om.sellacknamenum(drugstore) ;
    }

    @Override
    public int dellacknamenum() {
        return om.dellacknamenum();
    }

    @Override
    public int addpharmacy(YPharmacy ypharmacy) {
        return om.addpharmacy(ypharmacy);
    }

    @Override
    public int selpharymacyname(YPharmacy ypharmacy) {
        return om.selpharymacyname(ypharmacy);
    }

    @Override
    public int uppharymacy(YPharmacy ypharmacy) {
        return om.uppharymacy(ypharmacy);
    }

    @Override
    public int sellackcount() {
        return om.sellackcount();
    }

    @Override
    public int sellackName(YPharmacy ypharmacy) {
        return om.sellackName(ypharmacy);
    }

    @Override
    public int uplacknumber1(YPharmacy ypharmacy) {
        return om.uplacknumber1(ypharmacy);
    }

}

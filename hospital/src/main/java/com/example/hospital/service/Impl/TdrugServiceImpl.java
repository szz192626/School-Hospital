package com.example.hospital.service.Impl;

import com.example.hospital.entity.TPharmacy;
import com.example.hospital.entity.Trecord;
import com.example.hospital.mapper.TdrugMapper;
import com.example.hospital.service.TdrugService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class TdrugServiceImpl implements TdrugService {
    @Resource
    private TdrugMapper tdrugMapper;

    @Override
    public List<TPharmacy> selDrug(TPharmacy tpharmacy) {
        return tdrugMapper.selDrug(tpharmacy);
    }

    @Override
    public List<Trecord> selDrugs(Trecord trecord) {
        return tdrugMapper.selDrugs(trecord);
    }

    @Override
    public int addDrug(Trecord trecord) {
        return tdrugMapper.addDrug(trecord);
    }

    @Override
    public int updDrug(Trecord trecord) {
        return tdrugMapper.updDrug(trecord);
    }

    @Override
    public int delDrug(Trecord trecord) {
        return tdrugMapper.delDrug(trecord);
    }

    @Override
    public int updDrugs(Trecord trecord) {
        return tdrugMapper.updDrugs(trecord);
    }

    @Override
    public int updNum(Trecord trecord) {
        return tdrugMapper.updNum(trecord);
    }

    @Override
    public int upd(Trecord trecord) {
        return tdrugMapper.upd(trecord);
    }
}

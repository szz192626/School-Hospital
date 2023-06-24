package com.example.hospital.service.Impl;

import com.example.hospital.entity.Finance;
import com.example.hospital.entity.SdoctorDuibi;
import com.example.hospital.entity.currentFinance;
import com.example.hospital.mapper.FinanceMapper;
import com.example.hospital.service.FinanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class FinanceServiceImpl implements FinanceService {
    @Resource
    private FinanceMapper FinanceMapper;
    @Override
    public List<Double> reportYearFinance(String year) {
        return FinanceMapper.reportYearFinance(year);
    }

    @Override
    public List<Finance> reportYearBingFinance() {
        return FinanceMapper.reportYearBingFinance();
    }

    @Override
    public List<SdoctorDuibi> doctorDuibi(SdoctorDuibi sdoctorDuibi) {
        return FinanceMapper.doctorDuibi(sdoctorDuibi);
    }

    @Override
    public List<currentFinance> currentFinance(String current) {
        return FinanceMapper.currentFinance(current);
    }
}

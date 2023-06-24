package com.example.hospital.mapper;

import com.example.hospital.entity.Finance;
import com.example.hospital.entity.SdoctorDuibi;
import com.example.hospital.entity.currentFinance;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FinanceMapper {
    /*门诊月收入对比*/
    List<Double> reportYearFinance(String year);
    /*门诊年收入对比*/
    List<Finance> reportYearBingFinance();
    /*医生收入统计对比*/
    List<SdoctorDuibi> doctorDuibi(SdoctorDuibi sdoctorDuibi);
    /*门诊当天*/
    List<currentFinance> currentFinance(String current);
}

package com.example.hospital.service.Impl;

import com.example.hospital.entity.Report;
import com.example.hospital.entity.ReportVo;
import com.example.hospital.mapper.ReportMapper;
import com.example.hospital.service.ReportService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class ReportServiceImpl implements ReportService {
    @Resource
    private ReportMapper reportMapper;
    @Override
    public Integer addre(Report report) {
        return reportMapper.addre(report);
    }
    //删除患者
    @Override
    public Integer delre(Integer id) {
        return reportMapper.delre(id);
    }
    //判断正在就诊的患者电话唯一
    @Override
    public Integer phone(Report report) {
        return reportMapper.phone(report);
    }
    //判断正在就诊的患者身份证号唯一
    @Override
    public Integer carid(Report report) {
        return  reportMapper.carid(report);
    }

    @Override
    public int upddang() {
        return reportMapper.upddang();
    }
    //从门诊转入住院
    @Override
    public Integer zhuanyuan( Report report) {
        return  reportMapper.zhuanyuan(report);
    }


}

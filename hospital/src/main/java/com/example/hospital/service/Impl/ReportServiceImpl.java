package com.example.hospital.service.Impl;

import com.example.hospital.entity.*;
import com.example.hospital.mapper.ReportMapper;
import com.example.hospital.service.ReportService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class ReportServiceImpl implements ReportService {
    @Override
    public List<ReportVo> sel(ReportVo reportVo) {
        return reportMapper.sel(reportVo);
    }
    //查询某个患者的详细信息
    @Override
    public List<ReportVo> selById(Integer reportId) {
        return reportMapper.selById(reportId);
    }
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
    //查询挂号类型
    @Override
    public List<Registeredtype> selreg() {
        return reportMapper.selreg();
    }
    //根据所选挂号类型查询该科室的价格
    @Override
    public Integer seltymo(Registeredtype registeredtype) {
        return reportMapper.seltymo(registeredtype);
    }
    //查询科室
    @Override
    public List<Departments> seldep() {
        return reportMapper.seldep();
    }
    //查询排班医生
    @Override
    public List<ReportVo> one(Doctor doctor) {
        return reportMapper.one(doctor);
    }

    @Override
    public List<ReportVo> two(Doctor doctor) {
        return reportMapper.two(doctor);
    }

    @Override
    public List<ReportVo> three(Doctor doctor) {
        return reportMapper.three(doctor);
    }

    @Override
    public List<ReportVo> four(Doctor doctor) {
        return reportMapper.four(doctor);
    }

    @Override
    public List<ReportVo> five(Doctor doctor) {
        return reportMapper.five(doctor);
    }

    @Override
    public List<ReportVo> six(Doctor doctor) {
        return reportMapper.six(doctor);
    }

    @Override
    public List<ReportVo> seven(Doctor doctor) {
        return reportMapper.seven(doctor);
    }

}

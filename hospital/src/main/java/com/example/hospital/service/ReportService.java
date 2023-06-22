package com.example.hospital.service;

import com.example.hospital.entity.Registeredtype;
import com.example.hospital.entity.Report;
import com.example.hospital.entity.ReportVo;

import java.util.List;

public interface ReportService {
    //查询挂号的所有信息
    List<ReportVo> sel(ReportVo reportVo);
    List<ReportVo> selById(Integer reportId);
    Integer addre(Report report);
    //根据id删除某个患者的信息
    Integer delre(Integer id);
    //判断正在就诊的电话唯一
    Integer phone(Report report);
    //判断正在就诊的电话唯一
    Integer carid(Report report);
    //把今天预约而没有来的人进行删除
    int upddang();
    //从门诊转入住院
    Integer zhuanyuan(Report report);
    //查询所有的门诊类型
    List<Registeredtype> selreg();
    //根据所选挂号类型查询该科室的价格
    Integer seltymo(Registeredtype registeredtype);
}

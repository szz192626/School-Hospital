package com.example.hospital.mapper;

import com.example.hospital.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ReportMapper {
    //查询挂号的所有信息
    List<ReportVo> sel(ReportVo reportVo);
    List<ReportVo> selById(Integer reportId);
    //添加挂号人员
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
    //根据所选科室查询该科室的价格
    Integer seltymo(Registeredtype registeredtype);
    //查询医生的信息
    List<ReportVo> one(Doctor doctor);
    List<ReportVo> two(Doctor doctor);
    List<ReportVo> three(Doctor doctor);
    List<ReportVo> four(Doctor doctor);
    List<ReportVo> five(Doctor doctor);
    List<ReportVo> six(Doctor doctor);
    List<ReportVo> seven(Doctor doctor);
    //查询所有的科室
    List<Departments> seldep();
}

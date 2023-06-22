package com.example.hospital.controller;

import com.example.hospital.entity.Registeredtype;
import com.example.hospital.entity.Report;
import com.example.hospital.entity.ReportVo;
import com.example.hospital.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("yue")
public class ReportController {
    @Autowired
    private ReportService reportService;
    //查询所有数据
    @RequestMapping("index")
    public Object toreport(ReportVo reportVo, Model model, String params, Integer cc, HttpServletRequest request){
        reportVo.setCc(cc);
        HttpSession session = request.getSession();
        //将数据存储到session中
        session.setAttribute("ban",cc);
        reportService.upddang();
        String reportName=params;
        reportVo.setReportName(reportName);
        List<ReportVo> sel = reportService.sel(reportVo);
        model.addAttribute("report",sel);
        return "yue/report";
    }
    //添加新的挂号
    @RequestMapping("addre")
    @ResponseBody
    public Object addre(Report report){
        int addre = reportService.addre(report);
        if(addre==1){
            return "添加成功";
        }else{
            return "添加失败，请联系管理员";
        }

    }
    //根据id删除某个患者信息
    @RequestMapping("delre")
    @ResponseBody
    public Object delre(Integer id){
        int delre = reportService.delre(id);
        if(delre==1){
            return  "删除成功";
        }else{
            return  "删除失败";
        }

    }
    //根据id删除某个患者信息
    @RequestMapping("selById")
    @ResponseBody
    public Object selById(Integer reportId){
        List<ReportVo> reportVos = reportService.selById(reportId);
        return reportVos;
    }
    //判断就诊用户电话身份证号唯一
    @RequestMapping("phone")
    @ResponseBody
    public Object phone(Report report){
        int carid = reportService.carid(report);
        int phone = reportService.phone(report);
        if(carid>=1){
            return 2;
        }else if(phone>=1){
            return 1;
        }else{
            return 3;
        }
    }
    //转入住院部
    @RequestMapping("zhuanyuan")
    @ResponseBody
    public Object zhuanyuan(Integer id, Report report, String zhuan){
        report.setReportId(id);
        report.setZhuan(zhuan);
        Integer zhuanyuan = reportService.zhuanyuan(report);
        return zhuanyuan;
    }
    //查询所有的挂号类型
    @RequestMapping("/selreg")
    @ResponseBody
    public Object selreg(){
        List<Registeredtype> selreg = reportService.selreg();
        return selreg;
    }
    //根据挂号类型查找该类型的价格
    @RequestMapping("seltymo")
    @ResponseBody
    public Object seltymo(Registeredtype registeredtype){
        Integer seltymo = reportService.seltymo(registeredtype);
        return seltymo;
    }
}

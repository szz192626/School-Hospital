package com.example.hospital.controller;

import com.example.hospital.entity.*;
import com.example.hospital.service.CashierService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("wangcy")
public class CashierController {
    @Autowired
    private CashierService cashierService;
    //进入处方页面
    @RequestMapping("cc")
    public Object look(Model model){
        //查询所有药房
        List<Warehouse> selware = cashierService.selware();
        model.addAttribute("selware",selware);
        return  "yue/cashier";
    }
    //查询所有患者信息
    @RequestMapping("selpreson")
    @ResponseBody
    public Object selperson(Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<ReportVo> sel = cashierService.sel();
        PageInfo pageInfo = new PageInfo(sel);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //查询药品所有信息
    @RequestMapping("seldrug")
    @ResponseBody
    public Object seldrug(String durgname, Integer page, Integer limit, Pharmacy pharmacy){
        pharmacy.setPharmacyName(durgname);
        PageHelper.startPage(page, limit);
        List<Pharmacy> selpharm = cashierService.selpharm(pharmacy);
        PageInfo pageInfo = new PageInfo(selpharm);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //查询处方中是否有这个药
    @RequestMapping("selchu")
    @ResponseBody
    public Object seslchu(Cashier cashier, Integer reid, String mename){
        cashier.setReportId(reid);//把用户id存入数据库
        cashier.setDurgname(mename);//把药品名称存入实体类
        Integer selcadr = cashierService.selcadr(cashier);
        return selcadr;
    }
    //添加处方药品
    @RequestMapping("addchu")
    @ResponseBody
    public Object addchu(Cashier cashier,Pharmacy pharmacy){
        //向处方添加药品
        Integer addchu = cashierService.addchu(cashier);
        String pharmacyName=cashier.getDurgname();
        pharmacy.setPharmacyName(pharmacyName);
        //减少药房中的数量
        Integer deldrunum = cashierService.deldrunum(pharmacy);
        return addchu;
    }
    //查询该用户的处方
    @RequestMapping("selpepi")
    @ResponseBody
    public Object selpepi(Integer perid,Integer page, Integer limit){
        List<Cashier> selpepi = cashierService.selpepi(perid);
        PageHelper.startPage(page, limit);
        PageInfo pageInfo = new PageInfo(selpepi);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //删除处方中的药品
    @RequestMapping("del")
    @ResponseBody
    public Object del(Cashier cCashier,String durnme,Integer durnum,Pharmacy pharmacy){
        Integer del = cashierService.del(cCashier);
        pharmacy.setPharmacyName(durnme);
        pharmacy.setDrugstorenum(durnum);
        cashierService.adddrunum(pharmacy);
        if(del==0){
            return "删除失败";
        }else{
            return "删除成功";
        }
    }
    //如果处方中有该药品则修改该药品的数量和价钱
    @RequestMapping("updchu")
    @ResponseBody
    public Object updchu(Cashier cashier,Pharmacy pharmacy){
        //修改处方中药品的数量
        Integer updchu = cashierService.updchu(cashier);
        String pharmacyName=cashier.getDurgname();
        pharmacy.setPharmacyName(pharmacyName);
        //修改仓库中药品的数量
        Integer deldrunum = cashierService.deldrunum(pharmacy);
        return updchu;
    }
    //模糊查询
    @RequestMapping("mohu")
    @ResponseBody
    public Object mohu(String durgname,ReportVo reportVo, Integer page, Integer limit){
        reportVo.setReportName(durgname);
        PageHelper.startPage(page, limit);
        List<ReportVo> mohu = cashierService.mohu(reportVo);
        PageInfo pageInfo = new PageInfo(mohu);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //添加用户病因
    @RequestMapping("addbing")
    @ResponseBody
    public Object addbing(Integer reid, String bing, Report report){
        report.setZhuan(bing);
        report.setReportId(reid);
        Integer addbing = cashierService.addbing(report);
        return addbing;
    }

    //查询用户有没有填写病因
    @RequestMapping("selbing")
    @ResponseBody
    public Object selbing(Integer reid){
        String selbing = cashierService.selbing(reid);
        return selbing;
    }
    //查看用户的检查结果
    @RequestMapping("lookbing")
    @ResponseBody
    public Object lookbing(Integer reid){
        String lookbing = cashierService.lookbing(reid);
        return lookbing;
    }
    //查看该用户是否还有未交钱的项目
    @RequestMapping("seljiao")
    @ResponseBody()
    public Object seljiao(Integer reid){
        int seljiao = cashierService.seljiao(reid);
        return seljiao;
    }
    //查询该用户所有的处方
    @RequestMapping("selall")
    @ResponseBody
    public Object selall(Integer perid,Integer page, Integer limit){
        List<Cashier> selall = cashierService.selall(perid);
        PageHelper.startPage(page, limit);
        PageInfo pageInfo = new PageInfo(selall);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //查询用户所有的项目处方
    @RequestMapping("selximu")
    @ResponseBody
    public Object selximu(Integer perid,Integer page, Integer limit){
        List<Cashier> selximu = cashierService.selximu(perid);
        PageHelper.startPage(page, limit);
        PageInfo pageInfo = new PageInfo(selximu);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //查看该用户是否有缴费未做的项目
    @RequestMapping("selwei")
    @ResponseBody
    public Object selwei(Integer reid){
        //查询该用户有几个做过的项目
        Integer selyi = cashierService.selyi(reid);
        //查询该用户有几个缴费的项目
        Integer selgong = cashierService.selgong(reid);
        if(selyi==selgong){
            return 1;
        }else {
            return 0;
        }
    }
}


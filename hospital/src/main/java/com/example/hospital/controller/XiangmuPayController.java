package com.example.hospital.controller;

import com.example.hospital.entity.Cashier;
import com.example.hospital.service.XiangmuPayService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.hospital.service.XiangmuPayService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: szz
 * @date: 2023/6/26 19:46
 * @description XiangmuPayController
 */
@Controller
@RequestMapping("szzpay")
public class XiangmuPayController {
    @Autowired
    private XiangmuPayService XiangmuPayService;
    //进入项目收费页面
    @RequestMapping("xiangpay")
    public String xiangpay(){
        return "zhou/xaingmupay";
    }
    //选择患者后对该患者的项目进行查询
    @RequestMapping("selxiang")
    @ResponseBody
    public Object selxiang(Integer page,Integer limit,Integer perid){
        PageHelper.startPage(page, limit);
        List<Cashier> mohu = XiangmuPayService.selxiang(perid);
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
    //点击确认收费前确定该患者有没有收费项目
    @RequestMapping("selshoux")
    @ResponseBody
    public Object selshoux(Integer perid){
        Integer selshoux = XiangmuPayService.selshoux(perid);
        return  selshoux;
    }
    //项目缴费修改项目的收费状态
    @RequestMapping("shoufei")
    @ResponseBody
    public Object shoufei(Integer perid){
        Integer updxiang = XiangmuPayService.updxiang(perid);
        return updxiang;
    }
    //进入项目检查页面
    @RequestMapping("seljian")
    public Object seljian(){
        return "zhou/jiancha";
    }
    //查询该用户的所有要检查的项目
    @RequestMapping("selcha")
    @ResponseBody
    public Object selcha(Integer page,Integer limit,Integer perid){
        PageHelper.startPage(page, limit);
        List<Cashier> selcha = XiangmuPayService.selcha(perid);
        PageInfo pageInfo = new PageInfo(selcha);
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
    //添加用户项目的检查结果
    @RequestMapping("addbing")
    @ResponseBody
    public Object addbing(Cashier ccashier, Integer reid, String bing, Integer cashier){
        ccashier.setReportId(reid);
        ccashier.setJie(bing);
        ccashier.setCashier(cashier);
        Integer addjie =XiangmuPayService.addjie(ccashier);
        return addjie;
    }
}

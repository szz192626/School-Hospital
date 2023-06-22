package com.example.hospital.controller;

import com.example.hospital.entity.Cashier;
import com.example.hospital.entity.Outpatienttype;
import com.example.hospital.service.OutService;
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

/**
 * @author: szz
 * @date: 2023/6/22 17:22
 * @description OutController
 */
@Controller
@RequestMapping("caoout")
public class OutController {
    @Autowired
    private OutService cOutService;
    //进入处方划价页面
    @RequestMapping("xiang")
    public Object xiang(Model model){
        return  "cao/Cxiangmu";
    }
    //进入收费页面
    @RequestMapping("out")
    public Object look(Model model){
        return  "cao/Ctoll";
    }
    //查询药品所有信息




    //查询处方中是否有这个药
    @RequestMapping("selchuo")
    @ResponseBody
    public Object seslchuo(Cashier cCashier, Integer reid, String mename){
        cCashier.setReportId(reid);//把用户id存入数据库
        cCashier.setDurgname(mename);//把药品名称存入实体类
        Integer selcadr = cOutService.selchuo(cCashier);
        return selcadr;
    }
    //添加处方药品
    @RequestMapping("addchuo")
    @ResponseBody
    public Object addchuo(Cashier cCashier,Integer ostate){
        System.out.println(123);
        System.out.println(ostate);
        cCashier.setOstate(ostate);
        System.out.println(cCashier.getOstate());
        //向处方添加药品
        Integer addchuo = cOutService.addchuo(cCashier);
        return addchuo;
    }
    //如果处方中有该药品则修改该药品的数量和价钱


    //删除处方中的药品
    @RequestMapping("delo")
    @ResponseBody
    public Object del(Cashier cCashier){
        Integer del = cOutService.delo(cCashier);
        if(del==0){
            return "删除失败";
        }else{
            return "删除成功";
        }
    }
    //查询处方的总价钱


}


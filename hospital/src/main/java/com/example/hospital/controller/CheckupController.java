package com.example.hospital.controller;

import com.example.hospital.entity.Checkup;
import com.example.hospital.service.CheckupService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: szz
 * @date: 2023/6/26 21:49
 * @description CheckupController
 */

@Controller
@RequestMapping("szz")
public class CheckupController {

    @Autowired
    private CheckupService checkupService;

    @RequestMapping("/checkup")
    public String checkup(){
        return "liao/checkup";
    }

    //添加检查结果
    @RequestMapping("/addCheckup")
    @ResponseBody
    public Object addCheckup(Checkup lcheckup){
        //添加检查结果
        int i = checkupService.addCheckup(lcheckup);
        if(i==1){
            //添加检查费用
            checkupService.updPrice(lcheckup);
            return null;
        }else{
            return "添加异常";
        }
    }


    //查询患者检查结果
    @RequestMapping("/selCheckup")
    @ResponseBody
    public Object selCheckup(Integer page, Integer limit,Checkup lcheckup){
        PageHelper.startPage(page, limit);
        List<Checkup> lcheckups = checkupService.selCheckup(lcheckup);
        PageInfo pageInfo = new PageInfo(lcheckups);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
}

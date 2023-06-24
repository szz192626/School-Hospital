package com.example.hospital.controller;

import com.example.hospital.entity.Litem;
import com.example.hospital.service.LitemService;
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
 * @date: 2023/6/23 18:45
 * @description LitemController
 */
@Controller
@RequestMapping("/liao")
public class LitemController {

    @Autowired
    private LitemService litemService;

    @RequestMapping("/item")
    public String item(){
        return  "liao/item";
    }

    //查询收费项目
    @RequestMapping("/selItems")
    @ResponseBody
    public Object selItems(Integer page, Integer limit, Litem litem){
        PageHelper.startPage(page, limit);
        List<Litem> listAll =litemService.selItems(litem);
        PageInfo pageInfo = new PageInfo(listAll);
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

    //添加收费项目


    //查询患者收费项目


    //移除患者收费项目

}
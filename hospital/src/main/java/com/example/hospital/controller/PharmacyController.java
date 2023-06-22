package com.example.hospital.controller;

import com.example.hospital.entity.Record;
import com.example.hospital.entity.Recovery;
import com.example.hospital.entity.YPharmacy;
import com.example.hospital.service.PharmacyService;
import com.example.hospital.service.RecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PharmacyController {
    @Autowired
    private PharmacyService pharmacyService;
    @Autowired
    private RecordService rs;

    //查询药品仓库
    @RequestMapping("selectpharmacy")
    @ResponseBody
    public Object selectpharmary(YPharmacy ypharmacy, Integer page, Integer limit) {
        System.out.print("进去查询药房方法");
        PageHelper.startPage(page, limit);
        List<YPharmacy> drugstores = pharmacyService.selpharmacy(ypharmacy);
        PageInfo pageInfo = new PageInfo(drugstores);
        Map<String, Object> drugstoresData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        drugstoresData.put("code", 0);
        drugstoresData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        drugstoresData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        drugstoresData.put("data", pageInfo.getList());
        return drugstoresData;
    }

    @RequestMapping("delpharymary")
    @ResponseBody
    public  Integer delpharymary(YPharmacy ypharmacy,Recovery recovery){
        //删除药房此药（回收给库房）
        System.out.println("进入回收");
        int delpharymacy = pharmacyService.delpharymacy(ypharmacy);
        if(delpharymacy==1){
            pharmacyService.addrecovery(recovery);
        }
        System.out.println(delpharymacy);
        return delpharymacy;

    }
    //查询药品仓库
    @RequestMapping("selectrecovery")
    @ResponseBody
    public Object selecthuishou(Recovery recovery, Integer page, Integer limit) {
        System.out.print("进去查询药房方法");
        PageHelper.startPage(page, limit);
        List<Recovery> drugstores = pharmacyService.selrecovery(recovery);
        PageInfo pageInfo = new PageInfo(drugstores);
        Map<String, Object> drugstoresData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        drugstoresData.put("code", 0);
        drugstoresData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        drugstoresData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        drugstoresData.put("data", pageInfo.getList());
        return drugstoresData;
    }
    @RequestMapping("delrecovery")
    @ResponseBody
    public  Integer delhuishou(Recovery recovery, Record record){
        //删除回收表此药（处理）
        System.out.println("进入处理");
        int delhuishou = pharmacyService.delrecovery(recovery);
        if(delhuishou==1){
            System.out.print("添加记录表");
            int addjilu = rs.addjilu(record);//添加一条记录
        }

        return delhuishou;

    }


}

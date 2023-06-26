package com.example.hospital.controller;

import com.example.hospital.entity.*;
import com.example.hospital.entity.Record;
import com.example.hospital.service.PutinService;
import com.example.hospital.service.RecordService;
import com.example.hospital.service.StoreService;
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
@RequestMapping("seldrugstore")
public class StoreController {
    @Autowired
    private StoreService storeService;
    @Autowired
    private PutinService putinService;
    @Autowired
    private RecordService rs;
    //查询药品仓库
    @RequestMapping("selectdrugstore")
    @ResponseBody
    public Object seldrugstore(Drugstore drugstore, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Drugstore> drugstores = storeService.selStore(drugstore);
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
    //查询药品类型
    @RequestMapping("seltype")
    @ResponseBody
    public Object seltype(Type type) {
        List<Type> seltype = storeService.seltype(type);
        return seltype;
    }

    //查询计量单位
    @RequestMapping("selunit")
    @ResponseBody
    public Object selunit(Unit unit) {
        List<Unit> selunit = storeService.selunit(unit);
        return selunit;
    }
    //查询产地
    @RequestMapping("selarea")
    @ResponseBody
    public Object selarea(Area area) {
        List<Area> selarea = storeService.selarea(area);
        return selarea;
    }

    //查询供货商
    @RequestMapping("selupplier")
    @ResponseBody
    public Object selupplier(Upplier upplier, Model model) {
        List<Upplier> selupplier = storeService.selupplier(upplier);
        return selupplier;
    }

    //修改库房药品基本信息
    @RequestMapping("updrug")
    @ResponseBody
    public Object updrugstore(Drugstore drugstore) {
        int add = storeService.updrugstore(drugstore);
        if (add == 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    //供货商
    @RequestMapping("bpisselupplier")
    public Object bpisselupplier(Upplier upplier, Model model) {

        List<Upplier> selupplier = storeService.selupplier(upplier);
        return "drugstore/c_beputinstorage";
    }

    @RequestMapping("selectdgty")
    @ResponseBody
    public Object selectdgty(Drugdictionary drugdictionary, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Drugdictionary> drugdictiona = putinService.seldcy(drugdictionary);
        PageInfo pageInfo = new PageInfo(drugdictiona);
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

    //添加一条药品入库
    @RequestMapping("adddrugs")
    @ResponseBody
    public Integer adddrugs(Drugstore drugstore, Record record) {
        System.out.print("查询方法");
        Integer updrugnumber=0;
        Integer adddrugstore=0;
        int seldrugname = putinService.seldrugname(drugstore);
        System.out.println(seldrugname+"yyyyyyyyyyyyyyyyyyyyyyyy");
        if(seldrugname==1){
            System.out.print("进入修改方法");
            updrugnumber = putinService.updrugnumber(drugstore);
            System.out.print("添加记录表0");
            int addjilu = rs.addjilu(record);//添加一条记录

        }
        if (seldrugname!=1){
            System.out.print("进入添加方法");
            adddrugstore = putinService.adddrugstore(drugstore);
            System.out.print("添加记录表1");
            int addjilu = rs.addjilu(record);//添加一条记录

        }
        return adddrugstore+updrugnumber;
    }
    //查询选中的药品的库存数量
    @RequestMapping("selnumber")
    @ResponseBody
    public int selnumber(Drugstore drugstore) {
        System.out.print("查询数量方法");
        int selnumber = putinService.selnumber(drugstore);
        System.out.println(selnumber);
        return selnumber;
    }
    //查询仓库里药品数量不足的药品
    @RequestMapping("selectlackdrug")
    @ResponseBody
    public Object selectlackdrug(Drugstore drugstore, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Drugstore> drugstores = storeService.selectlackdrug(drugstore);//查询药品数量不足的药
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
    //查询采购单
    @RequestMapping("selpurchase")
    @ResponseBody
    public Object selpurchase(Purchase purchase, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Purchase> purchases = storeService.selpurchase(purchase);//查询遍历采购表
        PageInfo pageInfo = new PageInfo(purchases);
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

    //添加一条药品采购单
    @RequestMapping("addpurchase")
    @ResponseBody
    public Integer addpurchase(Purchase purchase) {
        int selpurchasename = storeService.selpurchasename(purchase);//查询采购单是是否已经存在此条数据
        if(selpurchasename==0){
            int seldrugname =storeService.addpurchase(purchase);//添加
            return seldrugname;

        }else {
            int uppurchasenumber = storeService.uppurchasenumber(purchase);//修改
            return uppurchasenumber;
        }

    }
    //删除一条药品采购单
    @RequestMapping("delpurchase")
    @ResponseBody
    public Integer delpurchase(Integer purchaseid) {
        int seldrugname =storeService.delpurchase(purchaseid);//删除此条采购数据
        return seldrugname;
    }
    //查询过期的药都有哪些
    @RequestMapping("seldrugDateexpire")
    @ResponseBody
    public Object seldrugDateexpire(Drugstore drugstore, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Drugstore> drugstores = storeService.seldrugDate(drugstore);
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
    //删除过期的药
    @RequestMapping("delexpiredurg")
    @ResponseBody
    public Integer delexpiredurg(Integer drugstoreId,Record record) {
        System.out.print("进入删除");
        int delexpiredurg = storeService.delexpiredurg(drugstoreId);//删除此条数据
        if(delexpiredurg==1){//如果删除此条 则添加到记录表

            System.out.print("添加记录表");
            int addjilu = rs.addjilu(record);
        }
        return delexpiredurg;
    }
}

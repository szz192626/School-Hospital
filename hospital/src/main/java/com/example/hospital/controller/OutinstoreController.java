package com.example.hospital.controller;

import com.example.hospital.entity.Drugstore;
import com.example.hospital.entity.Lack;
import com.example.hospital.entity.Record;
import com.example.hospital.entity.YPharmacy;
import com.example.hospital.service.OutinstoreService;
import com.example.hospital.service.RecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("chuku")
public class OutinstoreController {
    //自动装配
    @Autowired
    private OutinstoreService outinstoreService;
    @Autowired
    private RecordService rs;
    //查询报缺表
    @RequestMapping("sellack")
    @ResponseBody
    public Object sellack(Lack lack, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Lack> drugstores =outinstoreService.sellack(lack);//查询遍历报缺单数据
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
    //查询报缺表数据查询对应的 仓库数据
    @RequestMapping("sellackdrugname")
    @ResponseBody
    public Object sellackdrugname(Drugstore drugstore, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Drugstore> drugstores =outinstoreService.sellackdrugname(drugstore);//根据名字查询仓库药品
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
    //减库存数量
    @RequestMapping("updatedrugnumber")
    @ResponseBody
    public Integer updatedrugnumber(YPharmacy ypharmacy, Drugstore drugstore, Record record) {
        int uppharmacynumber=0;
        int seldrugnamenum = outinstoreService.seldrugnamenum(drugstore);
        //先修改仓库数据number
        int updatedrugnumber = outinstoreService.updatedrugnumber(drugstore);
        if(seldrugnamenum==1){//数量减空 删除此行药
            //再删除
            int deldrugnamenum = outinstoreService.deldrugnamenum(drugstore);

        }
        if(updatedrugnumber==1){//如果仓库数量修改成功
            System.out.print("添加记录表");
            int addjilu = rs.addjilu(record);//添加一条记录
            //修改报缺表数量
            int uplacknumber = outinstoreService.uplacknumber(drugstore);
            //查询报缺表数量是否有补给完毕的数据 即number 小于等于0 的数据
            int sellacknamenum = outinstoreService.sellacknamenum(drugstore);
            if(sellacknamenum>=1){//查询到有为number0的报缺数据
                //删除
                int dellacknamenum = outinstoreService.dellacknamenum();
            }
            if(uplacknumber==1){//报缺表减数成功则执行药房加数
                uppharmacynumber = outinstoreService.uppharmacynumber(drugstore);
            }
        }
        return uppharmacynumber;
    }
    //添加药品表数据
    @RequestMapping("addpharmacy")
    @ResponseBody
    public  Object addpharmacy(YPharmacy ypharmacy,Drugstore drugstore,Record record){
        int addpharmacy=0;
        int updatedrugnumber=0;
        int seldrugnamenum = outinstoreService.seldrugnamenum(drugstore);//出库的药品数量为最大值
        int selpharymacyname = outinstoreService.selpharymacyname(ypharmacy);//查询药品表是否已存在药出库的药
        System.out.println(selpharymacyname+"查询是否已存在药");
        if(selpharymacyname==1){//   药房 已存在此药名 则修改数量
            updatedrugnumber = outinstoreService.updatedrugnumber(drugstore); //修改库房此药的数量
            int uppharymacy = outinstoreService.uppharymacy(ypharmacy);     //修改药品数量
            int addjilu = rs.addjilu(record);//添加一条记录
            int sellackName = outinstoreService.sellackName(ypharmacy);//查询正在出库的药 有没有与报缺表冲突
            if(sellackName==1){//如果点击右边出库时 查询到与报缺表药名有相同的
                int uplacknumber1 = outinstoreService.uplacknumber1(ypharmacy);//对应的报缺表药品需求数量要随之减少
            }
            int sellacknamenum1 = outinstoreService.sellacknamenum(drugstore);//判断报缺表有没有补充完的
            if(sellacknamenum1==1){
                outinstoreService.dellacknamenum();//删除
            }
            if(seldrugnamenum==1){//查询库房药品有没有出库出空的
                outinstoreService.deldrugnamenum(drugstore);//出库完则删除此批
            }
        }
        if(selpharymacyname==0){//药房没有此药 则添加此药数据进药房
            System.out.print(selpharymacyname+"添加药品");
            updatedrugnumber = outinstoreService.updatedrugnumber(drugstore);//修改库房数量
            int addjilu = rs.addjilu(record);//添加一条记录
            addpharmacy = outinstoreService.addpharmacy(ypharmacy);//添加到药房
            int sellackName = outinstoreService.sellackName(ypharmacy);//报缺表是否有此药
            if(sellackName==1){//如果点击右边出库时 查询到与报缺表药名有相同的
                int uplacknumber1 = outinstoreService.uplacknumber1(ypharmacy);//对应的报缺表药品需求数量要随之减少
            }
        }
        if(seldrugnamenum==1){//查询库房药品有没有出库出空的
            outinstoreService.deldrugnamenum(drugstore);//出库完则删除此批
        }
        System.out.println(updatedrugnumber+"ssss");
        return updatedrugnumber;
    }

}

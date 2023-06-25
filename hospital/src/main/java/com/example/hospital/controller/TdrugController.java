package com.example.hospital.controller;

import com.example.hospital.entity.TPharmacy;
import com.example.hospital.entity.Trecord;
import com.example.hospital.service.TdrugService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("templates")
public class TdrugController {
    @Autowired
    private TdrugService tdrugService;

    //跳转药品登记页面
    @RequestMapping("/drug")
    public String admin(){
        return "/templates/drug";
    }
    //跳转取药页面
    @RequestMapping("/pharmacy")
    public String pharmacy(){
        return "/templates/pharmacy";
    }

    //查询药品信息
    @RequestMapping("/selDrug")
    @ResponseBody
    public Object selDrug(Integer page, Integer limit,TPharmacy tpharmacy){
        PageHelper.startPage(page, limit);
        List<TPharmacy> listAll =tdrugService.selDrug(tpharmacy);
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

    //查询用户的药品信息
    @RequestMapping("/selDrugs")
    @ResponseBody
    public Object selDrugs(Integer page, Integer limit, Trecord trecord){
        trecord.setState(0);
        PageHelper.startPage(page, limit);
        List<Trecord> listAll =tdrugService.selDrugs(trecord);
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

    //查询用户取过的药品信息
    @RequestMapping("/selPhar")
    @ResponseBody
    public Object selPhar(Integer page, Integer limit, Trecord trecord){
        trecord.setState(2);
        PageHelper.startPage(page, limit);
        List<Trecord> listAll =tdrugService.selDrugs(trecord);
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

    //查询药品库存数量
    @RequestMapping("/selNum")
    @ResponseBody
    public Object selNum(Integer pharmacyId){
        TPharmacy tpharmacy=new TPharmacy();
        tpharmacy.setPharmacyId(pharmacyId);
        List<TPharmacy> listAll =tdrugService.selDrug(tpharmacy);
        return listAll;
    }

    //添加药品清单
    @RequestMapping("/addDrug")
    @ResponseBody
    @Transactional
    public Object addDrug(Trecord trecord) {
        //查询是否添加过该药品
        trecord.setState(0);
        int rel = 0;
        //查询是否添加过但未取出该药品
        List<Trecord> trecords = tdrugService.selDrugs(trecord);
        for (int i = 0; i < trecords.size(); i++) {
            if (trecords.get(i).getDurgname().equals(trecord.getDurgname())) {
                rel = 1;
                break;
            }
        }
        if (rel == 1) {
            //修改患者药品数量
            int j = tdrugService.updDrug(trecord);
            if (j == 1) {
                //减少药品数量
                int o = tdrugService.updNum(trecord);
                if (o == 1) {
                    return "添加成功";
                } else {
                    return "添加失败";
                }
            } else {
                return "添加失败";
            }
        } else {
            //计算总价
            Double qian = trecord.getRepiceprice();
            Integer shu = trecord.getDurgnum();
            Double sum = qian * shu;
            trecord.setRepicetotal(sum);
            trecord.setState(0);
            //添加药品
            int i = tdrugService.addDrug(trecord);
            if (i == 1) {
                //减少药品数量
                int j = tdrugService.updNum(trecord);
                if (j == 1) {
                    return "添加成功";
                } else {
                    return "添加失败";
                }
            } else {
                return "添加失败";
            }
        }
    }

    //移除患者的药品信息
    @RequestMapping("/delDrug")
    @ResponseBody
    public Object delDrug(Integer hospitalpriceid,String durgname,Integer durgnum){
        Trecord trecord=new Trecord();
        trecord.setHospitalpriceid(hospitalpriceid);
        int i = tdrugService.delDrug(trecord);
        if (i == 1) {
            trecord.setDurgname(durgname);
            trecord.setDurgnum(durgnum);
            int j = tdrugService.updDrugs(trecord);
            if (j == 1) {
                return "移除成功";
            } else {
                return "移除失败";
            }
        } else {
            return "移除失败";
        }
    }

    //改变患者的药品状态
    @RequestMapping("/updDrug")
    @ResponseBody
    public Object updItem(Trecord trecord){
        int upd = tdrugService.upd(trecord);
        System.out.println(upd);
        return "取药成功";
    }

}

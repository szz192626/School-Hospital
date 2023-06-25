package com.example.hospital.controller;

import com.example.hospital.entity.Area;
import com.example.hospital.entity.Drugdictionary;
import com.example.hospital.entity.Type;
import com.example.hospital.entity.Unit;
import com.example.hospital.mapper.DrugdictionaryMapper;
import com.example.hospital.service.DrugdictionaryService;
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
@RequestMapping("drugdictionary")
public class DrugdictionaryController {
//    药品的增删改查
    @Autowired
    private DrugdictionaryService drugdictionaryService;
    /*
     * 查询药品
     * */
    @RequestMapping("findAllSdrugdictionary")
    @ResponseBody
    public Object DrugdictionaryList(Drugdictionary drugdictionary, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<DrugdictionaryMapper> listAll = drugdictionaryService.findAllDrugdictionary(drugdictionary);
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
    /*
     * 添加药品
     * */
    @RequestMapping("addDrugdictionary")
    @ResponseBody
    public Object addDrugdictionary(Drugdictionary drugdictionary){
        int count = drugdictionaryService.count(drugdictionary);
        if(count==0){
            int i = drugdictionaryService.addDrugdictionary(drugdictionary);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else {
            return drugdictionary.getDrugName()+"已存在";
        }

    }
    /*
     * 修改药品
     * */
    @RequestMapping("editDrugdictionary")
    @ResponseBody
    public Object editDrugdictionary(Drugdictionary drugdictionary){
        int i = drugdictionaryService.editDrugdictionary(drugdictionary);
        if(i==1){
            return "修改成功";
        }else{
            return "修改失败";
        }

    }
    /*
     * 删除药品
     * */
    @RequestMapping("deleteDrugdictionary")
    @ResponseBody
    public Object deleteDrugdictionary(Integer drugId){
        int i = drugdictionaryService.deleteDrugdictionary(drugId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    @RequestMapping("findAllArea")
    @ResponseBody
    public Object findAllArea(){
        List<Area> allArea = drugdictionaryService.findAllArea();
        return allArea;
    }
    @RequestMapping("findAllType")
    @ResponseBody
    public Object findAllType(){
        List<Type> allType = drugdictionaryService.findAllType();
        return allType;
    }
    @RequestMapping("findAllUnit")
    @ResponseBody
    public Object findAllUnit(){
        List<Unit> allUnit = drugdictionaryService.findAllUnit();
        return allUnit;
    }
}

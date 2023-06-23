package com.example.hospital.controller;

import com.example.hospital.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class MainController {
    /*
     * 查询周一到周日的排班
     * */
    @Autowired
    private MainService mainService;
    @RequestMapping("monday")
    @ResponseBody
    public Object monday(){
        List<Schedule> monday = mainService.monday();
        return monday;
    }
    @RequestMapping("tuesday")
    @ResponseBody
    public Object tuesday(){
        List<Schedule> tuesday = mainService.tuesday();
        return tuesday;
    }
    @RequestMapping("wednesday")
    @ResponseBody
    public Object wednesday(){
        List<Schedule> wednesday = mainService.wednesday();
        return wednesday;
    }
    @RequestMapping("thursday")
    @ResponseBody
    public Object thursday(){
        List<Schedule> thursday = mainService.thursday();
        return thursday;
    }
    @RequestMapping("friday")
    @ResponseBody
    public Object friday(){
        List<Schedule> friday = mainService.friday();
        return friday;
    }
    @RequestMapping("saturday")
    @ResponseBody
    public Object saturday(){
        List<Schedule> saturday = mainService.saturday();
        return saturday;
    }
    @RequestMapping("seven")
    @ResponseBody
    public Object sunday(){
        List<Schedule> sunday = mainService.sunday();
        return sunday;
    }
    /*
     * 查询当天门诊人数
     * */
    @RequestMapping("currentNum")
    @ResponseBody
    public Object currentNum(){
        int currentNum = mainService.currentNum();
        return currentNum;
    }
    /*
     * 查询所有人数
     * */
    @RequestMapping("Total")
    @ResponseBody
    public Object Total(){
        int Total = mainService.Total();
        return Total;
    }
    /*
     * 查询转院所有人数
     * */
    @RequestMapping("zhuanyuanTotal")
    @ResponseBody
    public Object zhuyuanTotal(){
        int zhuyuanTotal = mainService.zhuanyuanTotal();
        return zhuyuanTotal;
    }
    /*
     * 查询当天转院所有人数
     * */
    @RequestMapping("currentZhuanYuan")
    @ResponseBody
    public Object currentZhuanYuan(){
        int currentZhuanYuan = mainService.currentZhuanYuan();
        return currentZhuanYuan;
    }
}

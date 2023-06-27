package com.example.hospital.controller;

import com.example.hospital.entity.Schedule;
import com.example.hospital.entity.Work;
import com.example.hospital.service.ScheduleService;
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
@RequestMapping("schedule")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;
    @RequestMapping("findAllSchedule")
    @ResponseBody
    public Object findAllPaiban(Schedule schedule,Integer page,Integer limit){
        PageHelper.startPage(page, limit);
        List<Schedule> allPaiban = scheduleService.findAllSchedule(schedule);
        PageInfo pageInfo = new PageInfo(allPaiban);
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
    @RequestMapping("editSchedule")
    @ResponseBody
    public Object editPaiban(Schedule schedule){
        int count = scheduleService.count(schedule.getDoctorId());
        System.out.println(count);
        if(count==1){
            scheduleService.editSchedule(schedule);

        }else if(count==0){

            schedule.setDoctorId(schedule.getDoctorId());
            scheduleService.insertSchedule(schedule);
            scheduleService.editSchedule(schedule);
        }
        return "修改成功";
    }
    @RequestMapping("findAllWork")
    @ResponseBody
    public Object findAllBan(){
        List<Work> allBan = scheduleService.findAllWork();
        return allBan;
    }

}

package com.example.hospital.service.Impl;

import com.example.hospital.entity.Schedule;
import com.example.hospital.entity.Work;
import com.example.hospital.mapper.ScheduleMapper;

import javax.annotation.Resource;
import java.util.List;

public class ScheduleServiceImpl {
    @Resource
    private ScheduleMapper scheduleMapper;

    public List<Schedule> findAllPSchedule(Schedule schedule) {
        return scheduleMapper.findAllSchedule(schedule);
    }


    public int editSchedule(Schedule schedule) {
        return scheduleMapper.editSchedule(schedule);
    }


    public List<Work> findAllWork() {
        return scheduleMapper.findAllWork();
    }

    public int insertSchedule(Schedule schedule) {
        return scheduleMapper.insertSchedule(schedule);
    }

    public int count(Integer Id) {
        return scheduleMapper.count(Id);
    }

}

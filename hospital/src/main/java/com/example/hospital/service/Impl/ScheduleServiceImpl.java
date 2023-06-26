package com.example.hospital.service.Impl;

import com.example.hospital.entity.Schedule;
import com.example.hospital.entity.Work;
import com.example.hospital.mapper.ScheduleMapper;
import com.example.hospital.service.ScheduleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ScheduleServiceImpl  implements ScheduleService{
    @Resource
    private ScheduleMapper scheduleMapper;
    @Override
    public List<Schedule> findAllSchedule(Schedule schedule) {
        return scheduleMapper.findAllSchedule(schedule);
    }

    @Override
    public int editSchedule(Schedule schedule) {
        return scheduleMapper.editSchedule(schedule);
    }

    @Override
    public List<Work> findAllWork() {
        return scheduleMapper.findAllWork();
    }
    @Override
    public int insertSchedule(Schedule schedule) {
        return scheduleMapper.insertSchedule(schedule);
    }
    @Override
    public int count(Integer Id) {
        return scheduleMapper.count(Id);
    }

}

package com.example.hospital.mapper;

import com.example.hospital.entity.Schedule;
import com.example.hospital.entity.Work;

import java.util.List;

public interface ScheduleMapper {

    List<Schedule> findAllSchedule(Schedule schedule);
    int editSchedule(Schedule schedule);
    List<Work> findAllWork();
    int insertSchedule(Schedule schedule);
    int count(Integer Id);
}

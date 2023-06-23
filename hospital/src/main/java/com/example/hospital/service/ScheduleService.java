package com.example.hospital.service;

import com.example.hospital.entity.Schedule;
import com.example.hospital.entity.Work;

import java.util.List;

public interface ScheduleService {
    List<Schedule> findAllSchedule(Schedule schedule);
    int editSchedule(Schedule schedule);
    List<Work> findAllWork();
    int insertSchedule(Schedule schedule);
    int count(Integer Id);
}

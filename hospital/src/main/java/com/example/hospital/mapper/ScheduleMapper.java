package com.example.hospital.mapper;

import com.example.hospital.entity.Schedule;
import com.example.hospital.entity.Work;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ScheduleMapper {

    List<Schedule> findAllSchedule(Schedule schedule);
    int editSchedule(Schedule schedule);
    List<Work> findAllWork();
    int insertSchedule(Schedule schedule);
    int count(Integer Id);
}

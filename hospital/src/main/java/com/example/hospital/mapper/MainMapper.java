package com.example.hospital.mapper;

import com.example.hospital.entity.Schedule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {
    List<Schedule> monday();
    List<Schedule> tuesday();
    List<Schedule> wednesday();
    List<Schedule> thursday();
    List<Schedule> friday();
    List<Schedule> saturday();
    List<Schedule> sunday();
    int currentNum();
    int Total();
    int zhuanyuanTotal();
    int currentZhuanYuan();
}

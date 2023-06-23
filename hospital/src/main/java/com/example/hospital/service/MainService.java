package com.example.hospital.service;

import java.util.List;

public interface MainService {
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

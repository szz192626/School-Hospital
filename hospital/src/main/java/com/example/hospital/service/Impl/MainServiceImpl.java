package com.example.hospital.service.Impl;

import com.example.hospital.entity.Schedule;
import com.example.hospital.mapper.MainMapper;

import com.example.hospital.service.MainService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

import javax.annotation.Resource;


@Service
@Transactional
public class MainServiceImpl implements MainService {
    @Resource
    private MainMapper mainMapper;
    @Override
    public List<Schedule> monday() {
        return mainMapper.monday();
    }

    @Override
    public List<Schedule> tuesday() {
        return mainMapper.tuesday();
    }

    @Override
    public List<Schedule> wednesday() {
        return mainMapper.wednesday();
    }

    @Override
    public List<Schedule> thursday() {
        return mainMapper.thursday();
    }

    @Override
    public List<Schedule> friday() {
        return mainMapper.friday();
    }

    @Override
    public List<Schedule> saturday() {
        return mainMapper.saturday();
    }

    @Override
    public List<Schedule> sunday() {
        return mainMapper.sunday();
    }

    @Override
    public int currentNum() {
        return mainMapper.currentNum();
    }

    @Override
    public int Total() {
        return mainMapper.Total();
    }



    @Override
    public int zhuanyuanTotal() {
        return mainMapper.zhuanyuanTotal();
    }

    @Override
    public int currentZhuanYuan() {
        return mainMapper.currentZhuanYuan();
    }
}

package com.example.hospital.service;

import com.example.hospital.entity.Unit;

import java.util.List;

public interface UnitService {
    //计量单位的增删改查
    List<Unit> findAllUnit(Unit unit);
    int deleteUnit(Integer unitId);
    int addUnit(Unit unit);
    int count(Unit unit);
}

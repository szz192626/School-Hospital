package com.example.hospital.service;

import com.example.hospital.entity.Area;

import java.util.List;

public interface AreaService {
    /*
     * 药品产地的增删改查
     * */
    List<Area> findAllArea(Area area);
    int deleteArea(Integer areaId);
    int addArea(Area area);
    int count(Area area);
}

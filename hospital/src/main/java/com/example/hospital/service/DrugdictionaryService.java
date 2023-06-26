package com.example.hospital.service;

import com.example.hospital.entity.Area;
import com.example.hospital.entity.Drugdictionary;
import com.example.hospital.entity.Type;
import com.example.hospital.entity.Unit;
import com.example.hospital.mapper.DrugdictionaryMapper;

import java.util.List;

public interface DrugdictionaryService {
    List<DrugdictionaryMapper> findAllDrugdictionary(Drugdictionary Drugdictionary);
    int addDrugdictionary(Drugdictionary Drugdictionary);
    int editDrugdictionary(Drugdictionary Drugdictionary);
    int deleteDrugdictionary(Integer drugId);
    List<Unit> findAllUnit();
    List<Area> findAllArea();
    List<Type> findAllType();
    int count(Drugdictionary Drugdictionary);
}

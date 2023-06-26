package com.example.hospital.mapper;

import com.example.hospital.entity.Area;
import com.example.hospital.entity.Drugdictionary;
import com.example.hospital.entity.Type;
import com.example.hospital.entity.Unit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrugdictionaryMapper {
    //药品字典的增删改查
    List<DrugdictionaryMapper> findAllDrugdictionary(Drugdictionary drugdictionary);
    int addDrugdictionary(Drugdictionary drugdictionary);
    int editDrugdictionary(Drugdictionary drugdictionary);
    int deleteDrugdictionary(Integer drugId);
    List<Unit> findAllUnit();
    List<Area> findAllArea();
    List<Type> findAllType();
    int count(Drugdictionary drugdictionary);
}

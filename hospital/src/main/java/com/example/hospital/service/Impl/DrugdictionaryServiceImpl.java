package com.example.hospital.service.Impl;

import com.example.hospital.entity.Area;
import com.example.hospital.entity.Drugdictionary;
import com.example.hospital.entity.Type;
import com.example.hospital.entity.Unit;
import com.example.hospital.mapper.DrugdictionaryMapper;
import com.example.hospital.service.DrugdictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class DrugdictionaryServiceImpl implements DrugdictionaryService {
    @Resource
    private DrugdictionaryMapper drugdictionaryMapper;
    @Override
    public List<DrugdictionaryMapper> findAllDrugdictionary(Drugdictionary drugdictionary) {
        return drugdictionaryMapper.findAllDrugdictionary(drugdictionary);
    }

    @Override
    public int addDrugdictionary(Drugdictionary drugdictionary) {
        return drugdictionaryMapper.addDrugdictionary(drugdictionary);
    }

    @Override
    public int editDrugdictionary(Drugdictionary Drugdictionary) {
        return drugdictionaryMapper.editDrugdictionary(Drugdictionary);
    }

    @Override
    public int deleteDrugdictionary(Integer drugId) {

        return drugdictionaryMapper.deleteDrugdictionary(drugId);
    }

    @Override
    public List<Unit> findAllUnit() {
        return drugdictionaryMapper.findAllUnit();
    }

    @Override
    public List<Area> findAllArea() {
        return drugdictionaryMapper.findAllArea();
    }

    @Override
    public List<Type> findAllType() {
        return drugdictionaryMapper.findAllType();
    }

    @Override
    public int count(Drugdictionary Drugdictionary) {
        return drugdictionaryMapper.count(Drugdictionary);
    }
}

package com.example.hospital.service;

import com.example.hospital.entity.Type;

import java.util.List;

public interface TypeService {

    //药品类型的增删查改
    List<Type> findAllType(Type type);
    int deleteType(Integer typeId);
    int addType(Type type);
    int count(Type type);
}

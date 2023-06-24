package com.example.hospital.mapper;

import com.example.hospital.entity.Upplier;

import java.util.List;

public interface UpplierMapper {
    //供货商的增删查改
    List<Upplier> findAllUpplier(Upplier upplier);
    int deleteUpplier(Integer supplierId);
    int addUpplier(Upplier upplier);
    int count(Upplier upplier);
}

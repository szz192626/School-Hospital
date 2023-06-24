package com.example.hospital.service;

import com.example.hospital.entity.Warehouse;

import java.util.List;

public interface WarehouseService {
    List<Warehouse> findAllWarehouse(Warehouse warehouse);
    int deleteWarehouse(Integer warehouseId);
    int addWarehouse(Warehouse warehouse);
    int count(Warehouse warehouse);
}

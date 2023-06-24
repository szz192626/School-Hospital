package com.example.hospital.service.Impl;

import com.example.hospital.entity.Warehouse;
import com.example.hospital.mapper.WarehouseMapper;
import com.example.hospital.service.WarehouseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class WarehouseServiceImpl implements WarehouseService {
    @Resource
    private WarehouseMapper warehouseMapper;
    @Override
    public List<Warehouse> findAllWarehouse(Warehouse warehouse) { return warehouseMapper.findAllWarehouse(warehouse);}
    @Override
    public int deleteWarehouse(Integer warehouseId) {
        return warehouseMapper.deleteWarehouse(warehouseId);
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        return warehouseMapper.addWarehouse(warehouse);
    }


    @Override
    public int count(Warehouse warehouse) {
        return warehouseMapper.count(warehouse);
    }
}

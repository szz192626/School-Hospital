package com.example.hospital.mapper;

import com.example.hospital.entity.Warehouse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface WarehouseMapper {
    //库房的增删查改
    List<Warehouse> findAllWarehouse(Warehouse warehouse);
    int deleteWarehouse(Integer warehouseId);
    int addWarehouse(Warehouse warehouse);
    int count(Warehouse warehouse);
}

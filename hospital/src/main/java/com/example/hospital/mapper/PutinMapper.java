package com.example.hospital.mapper;

import com.example.hospital.entity.Drugstore;

import java.util.List;

public interface PutinMapper {

    //添加入库
    int adddrugstore(Drugstore drugstoreName);
    //查询药库是否已经存在药品名
    int seldrugname(Drugstore drugstore);
    int updrugnumber(Drugstore drugstore);
    //查询药品库存数量
    int selnumber(Drugstore drugstore);
}

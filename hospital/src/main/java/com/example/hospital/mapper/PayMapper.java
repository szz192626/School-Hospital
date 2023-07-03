package com.example.hospital.mapper;

import com.example.hospital.entity.Pay;
import com.example.hospital.entity.Record;
import com.example.hospital.entity.Register;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: szz
 * @date: 2023/6/29 22:15
 * @description PayMapper
 */
@Mapper
public interface PayMapper {
    int updPay(Register register);
    int addPay(Register register);
    List<Pay> selPays(Register register);
    List<Record> selSurplus(Record lrecord);
}

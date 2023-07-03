package com.example.hospital.service;

import com.example.hospital.entity.Pay;
import com.example.hospital.entity.Record;
import com.example.hospital.entity.Register;

import java.util.List;

/**
 * @author: szz
 * @date: 2023/6/29 22:37
 * @description PayService
 */
public interface PayService {

    int updPay(Register register);
    int addPay(Register register);
    List<Pay> selPays(Register register);
    List<Record> selSurplus(Record lrecord);
}

package com.example.hospital.service.Impl;

import com.example.hospital.entity.Pay;
import com.example.hospital.entity.Record;
import com.example.hospital.entity.Register;
import com.example.hospital.mapper.PayMapper;
import com.example.hospital.service.PayService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: szz
 * @date: 2023/6/29 22:38
 * @description PayServiceImpl
 */
@Service
@Transactional
public class PayServiceImpl implements PayService {

    @Resource
    private PayMapper lpayMapper;

    @Override
    public int updPay(Register register) {
        return lpayMapper.updPay(register);
    }

    @Override
    public int addPay(Register register) {
        return lpayMapper.addPay(register);
    }

    @Override
    public List<Pay> selPays(Register register) {
        return lpayMapper.selPays(register);
    }

    @Override
    public List<Record> selSurplus(Record lrecord) {
        return lpayMapper.selSurplus(lrecord);
    }
}

package com.example.hospital.service.Impl;

import com.example.hospital.entity.Checkup;
import com.example.hospital.mapper.CheckupMapper;
import com.example.hospital.service.CheckupService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: szz
 * @date: 2023/6/26 21:33
 * @description CheckupServiceImpl
 */
@Service
@Transactional
public class CheckupServiceImpl implements CheckupService {

    @Resource
    private CheckupMapper checkupMapper;

    @Override
    public int addCheckup(Checkup lcheckup) {
        return checkupMapper.addCheckup(lcheckup);
    }

    @Override
    public int updPrice(Checkup lcheckup) {
        return checkupMapper.updPrice(lcheckup);
    }

    @Override
    public List<Checkup> selCheckup(Checkup lcheckup) {
        return checkupMapper.selCheckup(lcheckup);
    }
}

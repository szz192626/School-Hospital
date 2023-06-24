package com.example.hospital.service.Impl;

import com.example.hospital.entity.Cashier;
import com.example.hospital.entity.Outpatienttype;
import com.example.hospital.entity.Pharmacy;
import com.example.hospital.entity.ReportVo;
import com.example.hospital.mapper.OutMapper;
import com.example.hospital.service.OutService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: szz
 * @date: 2023/6/22 17:18
 * @description OutServiceImpl
 */
@Service
@Transactional
public class OutServiceImpl implements OutService {
    @Resource
    private OutMapper cOutMapper;
    //查询门诊收费项目
    @Override
    public List<Pharmacy> selout(Outpatienttype coutpatienttype) {
        return cOutMapper.selout(coutpatienttype);
    }
    //查询该用户的处方中是否有该项目
    @Override
    public Integer selchuo(Cashier cCashier) {
        return cOutMapper.selchuo(cCashier);
    }
    //给该项目添加到处方表
    @Override
    public Integer addchuo(Cashier cCashier) {
        return cOutMapper.addchuo(cCashier);
    }
    //修改该项目的数量
    @Override
    public Integer updchuo(Cashier cCashier) {
        return cOutMapper.updchuo(cCashier);
    }
    //删除处方中的项目
    @Override
    public Integer delo(Cashier cCashier) {
        return cOutMapper.delo(cCashier);
    }
    //查询该用户的处方价格
    @Override
    public Double selch(Cashier cCashier) {
        return cOutMapper.selch(cCashier);
    }
    @Override
    public Integer shoufei(ReportVo reportVo) {
        return cOutMapper.shoufei(reportVo);
    }
    @Override
    public Integer guafei(ReportVo reportVo) {
        return cOutMapper.guafei(reportVo);
    }

}

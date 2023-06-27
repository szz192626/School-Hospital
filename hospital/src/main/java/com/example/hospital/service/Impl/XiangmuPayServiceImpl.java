package com.example.hospital.service.Impl;

import com.example.hospital.entity.Cashier;
import com.example.hospital.mapper.XiangmupayMapper;
import com.example.hospital.service.XiangmuPayService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: szz
 * @date: 2023/6/26 21:39
 * @description XiangmuPayServiceImpl
 */

@Service
@Transactional
public class XiangmuPayServiceImpl implements XiangmuPayService {
    @Resource
    private XiangmupayMapper cXiangmuPayMapper;
    //查询用户所有的项目然后
    @Override
    public List<Cashier> selxiang(Integer perid) {
        return cXiangmuPayMapper.selxiang(perid);
    }
    //查询该用户有没有收费项目
    @Override
    public Integer selshoux(Integer perid) {
        return cXiangmuPayMapper.selshoux(perid);
    }
    //项目收费修改项目的收费状态
    @Override
    public Integer updxiang(Integer perid) {
        return cXiangmuPayMapper.updxiang(perid);
    }
    //项目检查页面查询用户所有要检查的项目
    @Override
    public List<Cashier> selcha(Integer perid) {
        return cXiangmuPayMapper.selcha(perid);
    }
    //添加项目的检查结果
    @Override
    public Integer addjie(Cashier cCashier) {
        return cXiangmuPayMapper.addjie(cCashier);
    }
}

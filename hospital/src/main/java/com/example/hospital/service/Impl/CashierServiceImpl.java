package com.example.hospital.service.Impl;

import com.example.hospital.entity.*;
import com.example.hospital.mapper.CashierMapper;
import com.example.hospital.service.CashierService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CashierServiceImpl implements CashierService {
    @Resource
    private CashierMapper cashierMapper;
    //查询患者的所有信息用于也面表格展示
    @Override
    public List<ReportVo> sel() {
        return cashierMapper.sel();
    }
    //根据药房id查询所有的药品信息
    @Override
    public List<Pharmacy> selpharm(Pharmacy pharmacy) {
        return cashierMapper.selpharm(pharmacy);
    }
    //查询这个用户的处方表上有没有这个药
    @Override
    public Integer selcadr(Cashier cashier) {
        return cashierMapper.selcadr(cashier);
    }
    //添加处方药品
    @Override
    public Integer addchu(Cashier cashier) {
        return cashierMapper.addchu(cashier);
    }
    //如果处方中含有该药品则修改数量和价钱
    @Override
    public Integer updchu(Cashier cashier) {
        return cashierMapper.updchu(cashier);
    }

    //根据用户查询这个人的处方
    @Override
    public List<Cashier> selpepi(Integer perid) {
        return cashierMapper.selpepi(perid);
    }
    //删除处方中的药品
    @Override
    public Integer del(Cashier cashier) {
        return cashierMapper.del(cashier);
    }
    //减少药品中的数量
    @Override
    public Integer deldrunum(Pharmacy pharmacy) {
        return  cashierMapper.deldrunum(pharmacy);
    }
    //添加仓库中的数量
    @Override
    public Integer adddrunum(Pharmacy pharmacy) {
        return cashierMapper.adddrunum(pharmacy);
    }
    //模糊查询
    @Override
    public List<ReportVo> mohu(ReportVo reportVo) {
        return cashierMapper.mohu(reportVo);
    }
    //修改用户的病例
    @Override
    public Integer addbing(Report report) {
        return cashierMapper.addbing(report);
    }
    //查询用户有没有病例
    @Override
    public String selbing(Integer rid) {
        return cashierMapper.selbing(rid);
    }
    //查询所有药房放在药品下拉框中
    @Override
    public List<Warehouse> selware() {
        return cashierMapper.selware();
    }
}
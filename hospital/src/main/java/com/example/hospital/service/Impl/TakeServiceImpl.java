package com.example.hospital.service.Impl;

import com.example.hospital.entity.ReportVo;
import com.example.hospital.mapper.TakeMapper;
import com.example.hospital.service.TakeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: szz
 * @date: 2023/6/26 21:36
 * @description TakeServiceImpl
 */
@Service
@Transactional
public class TakeServiceImpl implements TakeService {
    @Resource
    private TakeMapper cTakeMapper;
    //查看交过费没取药的患者
    @Override
    public List<ReportVo> sel() {
        return cTakeMapper.sel();
    }
    //修改用户状态
    @Override
    public Integer chuku(ReportVo reportVo) {
        return cTakeMapper.chuku(reportVo);
    }
    //查看交过费取过要的患者
    @Override
    public List<ReportVo> selhuan(ReportVo reportVo) {
        return cTakeMapper.selhuan(reportVo);
    }
    //查询该用户的总价钱
    @Override
    public int zong(Integer reid) {
        return cTakeMapper.zong(reid);
    }
}

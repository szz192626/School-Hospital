package com.example.hospital.service.Impl;

import com.example.hospital.entity.Outpatienttype;
import com.example.hospital.entity.Projecttype;
import com.example.hospital.mapper.ProjectTypeMapper;
import com.example.hospital.service.ProjectTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ProjectTypeServiceImpl implements ProjectTypeService {

    @Resource
    private ProjectTypeMapper projectTypeMapper;
    /*
     * 项目大类增删改查
     * */
    @Override
    public List<Projecttype> findAllProjecttype(Projecttype projecttype) {
        return projectTypeMapper.findAllProjecttype(projecttype);
    }

    @Override
    public int addProjecttype(Projecttype projecttype) {
        return projectTypeMapper.addProjecttype(projecttype);
    }


    @Override
    public int deleteProjecttype(Integer projectId) {
        return projectTypeMapper.deleteProjecttype(projectId);
    }

    @Override
    public int count1(Projecttype projecttype) {
        return projectTypeMapper.count1(projecttype);
    }
    /*
     * 门诊项目增删改查
     * */
    @Override
    public List<Outpatienttype> findAllOutpatienttype(Outpatienttype outpatienttype) {
        return projectTypeMapper.findAllOutpatienttype(outpatienttype);
    }

    @Override
    public int addOutpatienttype(Outpatienttype outpatienttype) {
        return projectTypeMapper.addOutpatienttype(outpatienttype);
    }

    @Override
    public int editOutpatienttype(Outpatienttype outpatienttype) {
        return projectTypeMapper.editOutpatienttype(outpatienttype);
    }

    @Override
    public int deleteOutpatienttype(Integer outpatientId) {
        return projectTypeMapper.deleteOutpatienttype(outpatientId);
    }

    @Override
    public int count2(Outpatienttype outpatienttype) {
        return projectTypeMapper.count2(outpatienttype);
    }
}

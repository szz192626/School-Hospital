package com.example.hospital.service.Impl;

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
}

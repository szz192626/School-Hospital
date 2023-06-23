package com.example.hospital.service.Impl;

import com.example.hospital.entity.Departments;
import com.example.hospital.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl {
    @Resource
    private DepartmentMapper departmentMapper;

    public List<Departments> departmentList(Departments departments) {
        return departmentMapper.departmentList(departments);
    }


    public int deleteDepartment(Integer departmentId) {
        return departmentMapper.deleteDepartment(departmentId);
    }


    public int addDepartment(Departments departments) {
        return departmentMapper.addDepartment(departments);
    }


    public int count(Departments departments) {
        return departmentMapper.count(departments);
    }


    public int checkCount(Integer departmentId) {
        return departmentMapper.checkCount(departmentId);
    }

}

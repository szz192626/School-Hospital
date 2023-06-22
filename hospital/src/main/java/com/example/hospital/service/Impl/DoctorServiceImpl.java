package com.example.hospital.service.Impl;

import com.example.hospital.entity.Doctor;
import com.example.hospital.mapper.DoctorMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class DoctorServiceImpl {
    @Resource
    private DoctorMapper doctorMapper;
    public List<Doctor> doctorList(Doctor doctor) {
        return doctorMapper.doctorList(doctor);
    }

    public int deleteDoctor(Integer doctorId) {
        return doctorMapper.deleteDoctor(doctorId);
    }

    public int addDoctor(Doctor doctor) {
        return doctorMapper.addDoctor(doctor);
    }

    public int editDoctor(Doctor doctor) {
        return doctorMapper.editDoctor(doctor);
    }

    public int count(Doctor doctor) {
        return doctorMapper.count(doctor);
    }

    public int checkCount(Integer doctorId) {
        return doctorMapper.checkCount(doctorId);
    }

    //待写两个


}

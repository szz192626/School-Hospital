package com.example.hospital.mapper;

import com.example.hospital.entity.Departments;
import com.example.hospital.entity.Doctor;
import com.example.hospital.entity.Registeredtype;

import java.util.List;

public interface DoctorMapper {
    List<Doctor> doctorList(Doctor doctor);
    int deleteDoctor(Integer doctorId);
    int addDoctor(Doctor doctor);
    int editDoctor(Doctor doctor);

    int count(Doctor doctor);
    /*
     * 判断该医生是否还有病人
     * */
    int checkCount(Integer doctorId);

    List<Registeredtype>findAllRegisteredtype();
    List<Departments> findAllDepartments();
}

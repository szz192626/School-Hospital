package com.example.hospital.mapper;

import com.example.hospital.entity.Checkup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: szz
 * @date: 2023/6/26 19:33
 * @description CheckupMapper
 */
@Mapper
public interface CheckupMapper {

    int addCheckup(Checkup lcheckup);
    int updPrice(Checkup lcheckup);
    List<Checkup> selCheckup(Checkup lcheckup);
}


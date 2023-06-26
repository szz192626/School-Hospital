package com.example.hospital.service;

import com.example.hospital.entity.Checkup;

import java.util.List;

/**
 * @author: szz
 * @date: 2023/6/26 21:29
 * @description CheckupService
 */
public interface CheckupService {
    int addCheckup(Checkup lcheckup);
    int updPrice(Checkup lcheckup);
    List<Checkup> selCheckup(Checkup lcheckup);
}

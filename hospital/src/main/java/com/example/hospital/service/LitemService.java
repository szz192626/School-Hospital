package com.example.hospital.service;

import com.example.hospital.entity.Litem;

import java.util.List;

/**
 * @author: szz
 * @date: 2023/6/23 18:44
 * @description LitemService
 */
public interface LitemService {
    List<Litem> selItems(Litem litem);
}

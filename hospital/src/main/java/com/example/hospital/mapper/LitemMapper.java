package com.example.hospital.mapper;

import com.example.hospital.entity.Litem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: szz
 * @date: 2023/6/23 18:40
 * @description LitemMapper
 */
@Mapper
public interface LitemMapper {
    List<Litem> selItems(Litem litem);
}

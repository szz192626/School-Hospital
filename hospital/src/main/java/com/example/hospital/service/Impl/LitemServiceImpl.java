package com.example.hospital.service.Impl;

import com.example.hospital.entity.Litem;
import com.example.hospital.mapper.LitemMapper;
import com.example.hospital.service.LitemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: szz
 * @date: 2023/6/23 18:44
 * @description LitemServiceImpl
 */
@Service
@Transactional
public class LitemServiceImpl implements LitemService {

    @Resource
    private LitemMapper litemMapper;

    @Override
    public List<Litem> selItems(Litem litem) {
        return litemMapper.selItems(litem);
    }

}

package com.example.hospital.service.Impl;

import com.example.hospital.entity.Record;
import com.example.hospital.mapper.RecordMapper;
import com.example.hospital.service.RecordService;

import javax.annotation.Resource;
import java.util.List;

public class RecordServiceImpl implements RecordService {
    @Resource
    private RecordMapper rd;

    @Override
    public List<Record> selrecord(Record record) {
        return rd.selrecord(record);
    }
    @Override
    public int addjilu(Record record) {
        return rd.addjilu(record);
    }
}

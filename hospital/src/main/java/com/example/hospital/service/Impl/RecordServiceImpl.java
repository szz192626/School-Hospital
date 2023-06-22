package com.example.hospital.service.Impl;

import com.example.hospital.entity.Record;
import com.example.hospital.mapper.RecordMapper;

import javax.annotation.Resource;
import java.util.List;

public class RecordServiceImpl {
    @Resource
    private RecordMapper rd;

    public List<Record> selrecord(Record record) {
        return rd.selrecord(record);
    }

    public int addjilu(Record record) {
        return rd.addjilu(record);
    }
}

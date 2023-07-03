package com.example.hospital.mapper;

import com.example.hospital.entity.Outpatienttype;
import com.example.hospital.entity.Projecttype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectTypeMapper {
    /*
     * 项目增删改查
     * */
    List<Projecttype> findAllProjecttype(Projecttype projecttype);
    int addProjecttype(Projecttype projecttype);
    int deleteProjecttype(Integer projectId);
    int count1(Projecttype projecttype);
    /*
     * 门诊收费项目Outpatienttype
     * */
    List<Outpatienttype> findAllOutpatienttype(Outpatienttype outpatienttype);
    int addOutpatienttype(Outpatienttype outpatienttype);
    int editOutpatienttype(Outpatienttype outpatienttype);
    int deleteOutpatienttype(Integer outpatientId);
    int count2(Outpatienttype outpatienttype);
}

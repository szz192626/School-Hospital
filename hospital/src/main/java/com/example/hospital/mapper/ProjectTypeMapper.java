package com.example.hospital.mapper;

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
}

package com.dtkq.api.mapper;


import com.dtkq.api.entity.ClassObj;
import com.dtkq.api.entity.Doctor;

import java.util.List;

public interface ClassObjMapper {
    List<ClassObj> selectAll();

    int deleteByPrimaryKey(ClassObj classObj);

    int insert(ClassObj classObj);

    ClassObj selectByPrimaryKey(ClassObj classObj);

    int updateByPrimaryKey(ClassObj classObj);

}
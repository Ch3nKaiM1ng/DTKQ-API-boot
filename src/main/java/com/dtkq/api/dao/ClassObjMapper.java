package com.dtkq.api.dao;


import com.dtkq.api.entity.ClassObj;
import com.dtkq.api.entity.Doctor;

import java.util.List;

public interface ClassObjMapper {
    List<ClassObj> selectAll();

    List<ClassObj> selectByLimit(ClassObj classObj);

    List<ClassObj> findBackList(ClassObj classObj);

    int deleteByPrimaryKey(ClassObj classObj);

    int insert(ClassObj classObj);

    ClassObj selectByPrimaryKey(ClassObj classObj);

    List<ClassObj> selectByKey(ClassObj classObj);

    int updateByPrimaryKey(ClassObj classObj);

    int countNum(ClassObj classObj);
    int countBackNum(ClassObj classObj);
}
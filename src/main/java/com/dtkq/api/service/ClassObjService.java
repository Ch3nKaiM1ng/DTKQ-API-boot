package com.dtkq.api.service;


import com.dtkq.api.entity.ClassObj;
import com.dtkq.api.entity.Doctor;

import java.util.List;

public interface ClassObjService {
    List<ClassObj> selectAll();

    ClassObj selectObj(ClassObj classObj);

    List<ClassObj> selectByClassId(ClassObj classObj);

    void insertObj(ClassObj classObj);

    void updateObj(ClassObj classObj);

    void delectById(ClassObj classObj);
}

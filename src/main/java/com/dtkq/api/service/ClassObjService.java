package com.dtkq.api.service;


import com.dtkq.api.entity.ArticleComment;
import com.dtkq.api.entity.ClassObj;
import com.dtkq.api.entity.Doctor;

import java.util.List;

public interface ClassObjService {
    List<ClassObj> selectAll();

    List<ClassObj> selectByLimit(ClassObj classObj);

    List<ClassObj> findBackList(ClassObj classObj);

    ClassObj selectObj(ClassObj classObj);

    List<ClassObj> selectByClassId(ClassObj classObj);

    void insertObj(ClassObj classObj);

    void updateObj(ClassObj classObj);

    void delectById(ClassObj classObj);
    Integer countNum(ClassObj classObj);
    Integer countBackNum(ClassObj classObj);
}

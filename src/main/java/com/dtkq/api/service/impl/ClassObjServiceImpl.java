package com.dtkq.api.service.impl;

import com.dtkq.api.entity.ClassObj;
import com.dtkq.api.entity.Doctor;
import com.dtkq.api.entity.LinkClassObj;
import com.dtkq.api.mapper.ClassObjMapper;
import com.dtkq.api.mapper.DoctorMapper;
import com.dtkq.api.mapper.LinkClassObjMapper;
import com.dtkq.api.service.ClassObjService;
import com.dtkq.api.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassObjServiceImpl implements ClassObjService {

    @Autowired(required = false)
    private ClassObjMapper mapper;
    @Autowired(required = false)
    private LinkClassObjMapper linkMapper;
    @Override
    public List<ClassObj> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public ClassObj selectObj(ClassObj classObj) {
        ClassObj obj=mapper.selectByPrimaryKey(classObj);
        List<LinkClassObj> linkClassObj=linkMapper.selectByObjId(obj.getObjId());
        obj.setClassObjList(linkClassObj);
        return obj;
    }

    @Override
    public List<ClassObj> selectByClassId(ClassObj classObj) {
        return mapper.selectByKey(classObj);
    }

    @Override
    public void insertObj(ClassObj classObj) {
        mapper.insert(classObj);
    }


    @Override
    public void updateObj(ClassObj classObj) {
        mapper.updateByPrimaryKey(classObj);
    }

    @Override
    public void delectById(ClassObj classObj) {
        mapper.deleteByPrimaryKey(classObj);
    }
}

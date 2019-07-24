package com.dtkq.api.service.impl;

import com.dtkq.api.entity.DoctorClass;
import com.dtkq.api.mapper.DoctorClassMapper;
import com.dtkq.api.service.DoctorClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorClassServiceImpl implements DoctorClassService {


    @Autowired(required = false)
    private DoctorClassMapper mapper;
    @Override
    public List<DoctorClass> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public DoctorClass selectObj(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertObj(DoctorClass obj) {
        mapper.insert(obj);
    }


    @Override
    public void updateObj(DoctorClass obj) {
        mapper.updateByPrimaryKey(obj);
    }

    @Override
    public void delectById(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }
}

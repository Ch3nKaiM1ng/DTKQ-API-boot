package com.dtkq.api.service.impl;

import com.dtkq.api.entity.LinkDoctorClass;
import com.dtkq.api.dao.LinkDoctorClassMapper;
import com.dtkq.api.service.LinkDoctorClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkDoctorClassServiceImpl implements LinkDoctorClassService {


    @Autowired(required = false)
    private LinkDoctorClassMapper mapper;
    @Override
    public List<LinkDoctorClass> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public LinkDoctorClass selectObj(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertObj(LinkDoctorClass obj) {
        mapper.insert(obj);
    }


    @Override
    public void updateObj(LinkDoctorClass obj) {
        mapper.updateByPrimaryKey(obj);
    }

    @Override
    public void delectById(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }
    @Override
    public void deleteByKey(LinkDoctorClass obj) {
        mapper.deleteByKey(obj);
    }
}

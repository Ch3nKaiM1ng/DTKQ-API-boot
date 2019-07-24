package com.dtkq.api.service.impl;

import com.dtkq.api.entity.LinkClassObj;
import com.dtkq.api.entity.LinkDoctorClass;
import com.dtkq.api.mapper.LinkClassObjMapper;
import com.dtkq.api.mapper.LinkDoctorClassMapper;
import com.dtkq.api.service.LinkClassObjService;
import com.dtkq.api.service.LinkDoctorClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkClassObjServiceImpl implements LinkClassObjService {

    @Autowired(required = false)
    private LinkClassObjMapper mapper;
    @Override
    public List<LinkClassObj> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public LinkClassObj selectObj(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertObj(LinkClassObj obj) {
        mapper.insert(obj);
    }


    @Override
    public void updateObj(LinkClassObj obj) {
        mapper.updateByPrimaryKey(obj);
    }

    @Override
    public void delectById(LinkClassObj obj) {
        mapper.deleteByPrimaryKey(obj);
    }
}

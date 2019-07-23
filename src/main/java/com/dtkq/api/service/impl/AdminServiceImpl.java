package com.dtkq.api.service.impl;

import com.dtkq.api.entity.Admin;
import com.dtkq.api.mapper.AdminMapper;
import com.dtkq.api.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired(required = false)
    private AdminMapper mapper;
    @Override
    public List<Admin> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public Admin selectObj(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public Admin checkUser(Admin obj) {
        return mapper.checkUser(obj);
    }

    @Override
    public void insertObj(Admin obj) {
        mapper.insert(obj);
    }


    @Override
    public void updateObj(Admin obj) {
        mapper.updateByPrimaryKey(obj);
    }

    @Override
    public void delectById(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }
}

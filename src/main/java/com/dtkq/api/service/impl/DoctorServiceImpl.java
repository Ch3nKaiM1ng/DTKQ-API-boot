package com.dtkq.api.service.impl;

import com.dtkq.api.entity.Doctor;
import com.dtkq.api.mapper.DoctorMapper;
import com.dtkq.api.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {


    @Autowired(required = false)
    private DoctorMapper mapper;
    @Override
    public List<Doctor> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public Doctor selectObj(Doctor doctor) {
        return mapper.selectByPrimaryKey(doctor);
    }

    @Override
    public void insertObj(Doctor doctor) {
        mapper.insert(doctor);
    }


    @Override
    public void updateObj(Doctor doctor) {
        mapper.updateByPrimaryKey(doctor);
    }

    @Override
    public void delectById(Doctor doctor) {
        mapper.deleteByPrimaryKey(doctor);
    }
}

package com.mylike.api.service.impl;

import com.mylike.api.entity.Doctor;
import com.mylike.api.mapper.DoctorMapper;
import com.mylike.api.service.DoctorService;
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

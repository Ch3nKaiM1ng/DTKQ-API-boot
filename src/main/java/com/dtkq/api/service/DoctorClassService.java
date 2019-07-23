package com.dtkq.api.service;


import com.dtkq.api.entity.DoctorClass;
import com.dtkq.api.entity.DoctorClass;

import java.util.List;

public interface DoctorClassService {
    List<DoctorClass> selectAll();

    DoctorClass selectObj(Integer id);

    void insertObj(DoctorClass obj);

    void updateObj(DoctorClass obj);

    void delectById(Integer id);
}

package com.dtkq.api.service;


import com.dtkq.api.entity.DoctorClass;
import com.dtkq.api.entity.LinkDoctorClass;

import java.util.List;

public interface LinkDoctorClassService {
    List<LinkDoctorClass> selectAll();

    LinkDoctorClass selectObj(Integer id);

    void insertObj(LinkDoctorClass obj);

    void updateObj(LinkDoctorClass obj);

    void delectById(Integer id);
}

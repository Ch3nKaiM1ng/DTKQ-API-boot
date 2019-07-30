package com.dtkq.api.service;


import com.dtkq.api.entity.Doctor;

import java.util.List;
public interface DoctorService {

    List<Doctor> selectAll();

    List<Doctor> select(Doctor doctor);

    Doctor selectObj(Doctor doctor);

    void insertObj(Doctor doctor);

    void updateObj(Doctor doctor);

    void delectById(Doctor doctor);
}

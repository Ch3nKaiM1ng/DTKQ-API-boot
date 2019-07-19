package com.dtkq.api.mapper;


import com.dtkq.api.entity.Doctor;

import java.util.List;

public interface DoctorMapper {
    List<Doctor> selectAll();

    int deleteByPrimaryKey(Doctor doctor);

    int insert(Doctor doctor);

    Doctor selectByPrimaryKey(Doctor doctor);

    int updateByPrimaryKey(Doctor doctor);

}
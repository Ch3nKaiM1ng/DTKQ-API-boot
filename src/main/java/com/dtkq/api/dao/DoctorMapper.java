package com.dtkq.api.dao;


import com.dtkq.api.entity.Ask;
import com.dtkq.api.entity.Doctor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorMapper {

    List<Doctor> selectAll();

    List<Doctor> select(Doctor doctor);
    List<Doctor> selectAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    int deleteByPrimaryKey(Doctor doctor);

    int insert(Doctor doctor);

    Doctor selectByPrimaryKey(Doctor doctor);

    int updateByPrimaryKey(Doctor doctor);
    int countNum(Doctor doctor);
}
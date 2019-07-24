package com.dtkq.api.mapper;

import com.dtkq.api.entity.LinkClassObj;
import com.dtkq.api.entity.LinkDoctorClass;

import java.util.List;

public interface LinkClassObjMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(LinkClassObj record);

    LinkClassObj selectByPrimaryKey(Integer id);

    List<LinkClassObj> selectAll();

    int updateByPrimaryKey(LinkClassObj record);
}
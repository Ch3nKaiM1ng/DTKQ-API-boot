package com.dtkq.api.dao;

import com.dtkq.api.entity.LinkClassObj;
import com.dtkq.api.entity.LinkDoctorClass;

import java.util.List;

public interface LinkClassObjMapper {

    int deleteByPrimaryKey(LinkClassObj record);

    int insert(LinkClassObj record);

    LinkClassObj selectByPrimaryKey(Integer id);

    List<LinkClassObj> selectByObjId(Integer id);

    List<LinkClassObj> selectAll();

    int updateByPrimaryKey(LinkClassObj record);
}
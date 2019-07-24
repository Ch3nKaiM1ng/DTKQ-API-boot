package com.dtkq.api.service;


import com.dtkq.api.entity.LinkClassObj;
import com.dtkq.api.entity.LinkDoctorClass;

import java.util.List;

public interface LinkClassObjService {
    List<LinkClassObj> selectAll();

    LinkClassObj selectObj(Integer id);

    void insertObj(LinkClassObj obj);

    void updateObj(LinkClassObj obj);

    void delectById(LinkClassObj obj);
}

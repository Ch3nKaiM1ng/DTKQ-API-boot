package com.dtkq.api.service.impl;

import com.dtkq.api.entity.Doctor;
import com.dtkq.api.entity.TopImg;
import com.dtkq.api.mapper.DoctorMapper;
import com.dtkq.api.mapper.TopImgMapper;
import com.dtkq.api.service.DoctorService;
import com.dtkq.api.service.TopImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopImgServiceImpl implements TopImgService {


    @Autowired(required = false)
    private TopImgMapper mapper;
    @Override
    public List<TopImg> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public TopImg selectObj(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertObj(TopImg topImg) {
        mapper.insert(topImg);
    }


    @Override
    public void updateObj(TopImg topImg) {
        mapper.updateByPrimaryKey(topImg);
    }

    @Override
    public void delectById(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }
}

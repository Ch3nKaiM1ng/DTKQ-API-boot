package com.dtkq.api.service.impl;

import com.dtkq.api.entity.TopImg;
import com.dtkq.api.entity.TopMenu;
import com.dtkq.api.mapper.TopImgMapper;
import com.dtkq.api.mapper.TopMenuMapper;
import com.dtkq.api.service.TopImgService;
import com.dtkq.api.service.TopMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopMenuServiceImpl implements TopMenuService {


    @Autowired(required = false)
    private TopMenuMapper mapper;
    @Override
    public List<TopMenu> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public TopMenu selectObj(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertObj(TopMenu obj) {
        mapper.insert(obj);
    }


    @Override
    public void updateObj(TopMenu obj) {
        mapper.updateByPrimaryKey(obj);
    }

    @Override
    public void delectById(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }
}

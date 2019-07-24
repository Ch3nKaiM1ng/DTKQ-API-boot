package com.dtkq.api.service.impl;

import com.dtkq.api.entity.Banner;
import com.dtkq.api.entity.TopMenu;
import com.dtkq.api.mapper.BannerMapper;
import com.dtkq.api.mapper.TopMenuMapper;
import com.dtkq.api.service.BannerService;
import com.dtkq.api.service.TopMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {


    @Autowired(required = false)
    private BannerMapper mapper;
    @Override
    public List<Banner> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public Banner selectObj(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertObj(Banner obj) {
        mapper.insert(obj);
    }


    @Override
    public void updateObj(Banner obj) {
        mapper.updateByPrimaryKey(obj);
    }

    @Override
    public void delectById(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }
}

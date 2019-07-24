package com.dtkq.api.service.impl;

import com.dtkq.api.entity.TalkClass;
import com.dtkq.api.mapper.TalkClassMapper;
import com.dtkq.api.service.TalkClassService;
import com.dtkq.api.service.TalkClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TalkClassServiceImpl implements TalkClassService {

    @Autowired(required = false)
    private TalkClassMapper mapper;
    @Override
    public List<TalkClass> selectAll(TalkClass obj) {
        return mapper.selectAll(obj);
    }

    @Override
    public TalkClass selectObj(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertObj(TalkClass obj) {
        mapper.insert(obj);
    }


    @Override
    public void updateObj(TalkClass obj) {
        mapper.updateByPrimaryKey(obj);
    }

    @Override
    public void delectById(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }
}

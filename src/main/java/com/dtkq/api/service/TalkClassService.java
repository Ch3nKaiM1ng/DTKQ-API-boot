package com.dtkq.api.service;


import com.dtkq.api.entity.TalkClass;
import com.dtkq.api.entity.TalkClass;

import java.util.List;

public interface TalkClassService {
    List<TalkClass> selectAll(TalkClass obj);

    List<TalkClass> findWebList(TalkClass obj);

    TalkClass selectObj(Integer id);

    void insertObj(TalkClass obj);

    void updateObj(TalkClass obj);

    void delectById(Integer id);
}

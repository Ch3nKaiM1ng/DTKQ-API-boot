package com.dtkq.api.service;


import com.dtkq.api.entity.TopImg;
import com.dtkq.api.entity.TopMenu;

import java.util.List;

public interface TopMenuService {
    List<TopMenu> selectAll();

    TopMenu selectObj(Integer id);

    void insertObj(TopMenu obj);

    void updateObj(TopMenu obj);

    void delectById(Integer id);
}

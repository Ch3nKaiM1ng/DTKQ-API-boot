package com.dtkq.api.service;


import com.dtkq.api.entity.Banner;
import com.dtkq.api.entity.TopMenu;

import java.util.List;

public interface BannerService {
    List<Banner> selectAll();

    Banner selectObj(Integer id);

    void insertObj(Banner obj);

    void updateObj(Banner obj);

    void delectById(Integer id);
}

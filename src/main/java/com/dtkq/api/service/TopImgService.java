package com.dtkq.api.service;


import com.dtkq.api.entity.Doctor;
import com.dtkq.api.entity.TopImg;

import java.util.List;

public interface TopImgService {
    List<TopImg> selectAll();

    TopImg selectObj(Integer id);

    void insertObj(TopImg doctor);

    void updateObj(TopImg doctor);

    void delectById(Integer id);
}

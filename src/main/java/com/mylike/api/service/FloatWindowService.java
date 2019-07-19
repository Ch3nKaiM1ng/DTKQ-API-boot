package com.mylike.api.service;

import com.mylike.api.entity.FloatWindow;

import java.util.List;

public interface FloatWindowService {
    List<FloatWindow> selectAll();

    FloatWindow selectObj(FloatWindow floatWindow);

    void insertFloat(FloatWindow floatWindow);

    void updateFloat(FloatWindow floatWindow);

    void delectById(Integer id);
}

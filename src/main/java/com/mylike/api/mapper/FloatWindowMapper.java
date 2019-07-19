package com.mylike.api.mapper;


import com.mylike.api.entity.FloatWindow;

import java.util.List;

public interface FloatWindowMapper {
    List<FloatWindow> selectAll();

    int deleteByPrimaryKey(Integer Id);

    int insert(FloatWindow floatWindow);

    FloatWindow selectByPrimaryKey(FloatWindow floatWindow);

    int updateByPrimaryKey(FloatWindow floatWindow);

}
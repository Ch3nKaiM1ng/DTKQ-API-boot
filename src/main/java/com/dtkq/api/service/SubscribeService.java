package com.dtkq.api.service;

import com.dtkq.api.entity.Subscribe;
import java.util.List;

/**
 * (Subscribe)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:24:30
 */
public interface SubscribeService {

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    Subscribe queryById(Integer sId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Subscribe> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param subscribe 实例对象
     * @return 实例对象
     */
    Subscribe insert(Subscribe subscribe);

    /**
     * 修改数据
     *
     * @param subscribe 实例对象
     * @return 实例对象
     */
    Subscribe update(Subscribe subscribe);

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sId);

}
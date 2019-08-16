package com.dtkq.api.service;

import com.dtkq.api.entity.Advertisement;
import com.dtkq.api.entity.Article;

import java.util.List;

/**
 * (Advertisement)表服务接口
 *
 * @author makejava
 * @since 2019-08-16 14:07:47
 */
public interface AdvertisementService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Advertisement queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Advertisement> queryAllByLimit(int offset, int limit);
    List<Advertisement> queryAll(Advertisement advertisement);

    /**
     * 新增数据
     *
     * @param advertisement 实例对象
     * @return 实例对象
     */
    Advertisement insert(Advertisement advertisement);

    /**
     * 修改数据
     *
     * @param advertisement 实例对象
     * @return 实例对象
     */
    Advertisement update(Advertisement advertisement);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    boolean addNum(Integer id);
    Integer countNum(Advertisement advertisement);
}
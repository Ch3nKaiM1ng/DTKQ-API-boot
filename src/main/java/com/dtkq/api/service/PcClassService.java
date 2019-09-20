package com.dtkq.api.service;

import com.dtkq.api.entity.PcClass;
import java.util.List;

/**
 * (PcClass)表服务接口
 *
 * @author makejava
 * @since 2019-09-19 15:21:29
 */
public interface PcClassService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PcClass queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PcClass> queryAllByLimit(int offset, int limit);

    List<PcClass> queryAll(PcClass pcClass);

    /**
     * 新增数据
     *
     * @param pcClass 实例对象
     * @return 实例对象
     */
    PcClass insert(PcClass pcClass);

    /**
     * 修改数据
     *
     * @param pcClass 实例对象
     * @return 实例对象
     */
    PcClass update(PcClass pcClass);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
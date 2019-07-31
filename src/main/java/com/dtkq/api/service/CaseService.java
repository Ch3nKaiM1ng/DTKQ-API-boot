package com.dtkq.api.service;

import com.dtkq.api.entity.Ask;
import com.dtkq.api.entity.Case;
import java.util.List;

/**
 * (Case)表服务接口
 *
 * @author makejava
 * @since 2019-07-26 17:38:48
 */
public interface CaseService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Case queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Case> queryAllByLimit(int offset, int limit);
    List<Case> queryAll(Case entity);
    /**
     * 新增数据
     *
     * @param entity 实例对象
     * @return 实例对象
     */
    Case insert(Case entity);

    /**
     * 修改数据
     *
     * @param entity 实例对象
     * @return 实例对象
     */
    Case update(Case entity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    Case addNum(Case entity);

    Integer countNum(Case entity);
}
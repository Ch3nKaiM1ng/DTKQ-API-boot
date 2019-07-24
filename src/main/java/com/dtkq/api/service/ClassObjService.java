package com.dtkq.api.service;

import com.dtkq.api.entity.ClassObj;
import java.util.List;

/**
 * (ClassObj)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:23:20
 */
public interface ClassObjService {

    /**
     * 通过ID查询单条数据
     *
     * @param objId 主键
     * @return 实例对象
     */
    ClassObj queryById(Integer objId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ClassObj> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param classObj 实例对象
     * @return 实例对象
     */
    ClassObj insert(ClassObj classObj);

    /**
     * 修改数据
     *
     * @param classObj 实例对象
     * @return 实例对象
     */
    ClassObj update(ClassObj classObj);

    /**
     * 通过主键删除数据
     *
     * @param objId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer objId);

}
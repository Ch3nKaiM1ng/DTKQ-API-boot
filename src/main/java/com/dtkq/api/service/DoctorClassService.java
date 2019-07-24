package com.dtkq.api.service;

import com.dtkq.api.entity.DoctorClass;
import java.util.List;

/**
 * (DoctorClass)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:23:45
 */
public interface DoctorClassService {

    /**
     * 通过ID查询单条数据
     *
     * @param classId 主键
     * @return 实例对象
     */
    DoctorClass queryById(Integer classId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DoctorClass> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param doctorClass 实例对象
     * @return 实例对象
     */
    DoctorClass insert(DoctorClass doctorClass);

    /**
     * 修改数据
     *
     * @param doctorClass 实例对象
     * @return 实例对象
     */
    DoctorClass update(DoctorClass doctorClass);

    /**
     * 通过主键删除数据
     *
     * @param classId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer classId);

}
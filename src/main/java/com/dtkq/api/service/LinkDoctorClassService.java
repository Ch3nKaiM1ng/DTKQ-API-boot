package com.dtkq.api.service;

import com.dtkq.api.entity.LinkDoctorClass;
import java.util.List;

/**
 * (LinkDoctorClass)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:24:22
 */
public interface LinkDoctorClassService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LinkDoctorClass queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LinkDoctorClass> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param linkDoctorClass 实例对象
     * @return 实例对象
     */
    LinkDoctorClass insert(LinkDoctorClass linkDoctorClass);

    /**
     * 修改数据
     *
     * @param linkDoctorClass 实例对象
     * @return 实例对象
     */
    LinkDoctorClass update(LinkDoctorClass linkDoctorClass);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
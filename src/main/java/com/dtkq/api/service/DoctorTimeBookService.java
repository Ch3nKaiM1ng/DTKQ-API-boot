package com.dtkq.api.service;

import com.dtkq.api.entity.DoctorTimeBook;
import java.util.List;

/**
 * (DoctorTimeBook)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:24:03
 */
public interface DoctorTimeBookService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DoctorTimeBook queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DoctorTimeBook> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param doctorTimeBook 实例对象
     * @return 实例对象
     */
    DoctorTimeBook insert(DoctorTimeBook doctorTimeBook);

    /**
     * 修改数据
     *
     * @param doctorTimeBook 实例对象
     * @return 实例对象
     */
    DoctorTimeBook update(DoctorTimeBook doctorTimeBook);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
package com.dtkq.api.service;

import com.dtkq.api.entity.AdminAuth;
import java.util.List;

/**
 * (AdminAuth)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:21:18
 */
public interface AdminAuthService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdminAuth queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AdminAuth> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param adminAuth 实例对象
     * @return 实例对象
     */
    AdminAuth insert(AdminAuth adminAuth);

    /**
     * 修改数据
     *
     * @param adminAuth 实例对象
     * @return 实例对象
     */
    AdminAuth update(AdminAuth adminAuth);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
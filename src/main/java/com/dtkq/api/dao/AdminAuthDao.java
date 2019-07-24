package com.dtkq.api.dao;

import com.dtkq.api.entity.AdminAuth;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (AdminAuth)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 16:21:18
 */
public interface AdminAuthDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdminAuth queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AdminAuth> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param adminAuth 实例对象
     * @return 对象列表
     */
    List<AdminAuth> queryAll(AdminAuth adminAuth);

    /**
     * 新增数据
     *
     * @param adminAuth 实例对象
     * @return 影响行数
     */
    int insert(AdminAuth adminAuth);

    /**
     * 修改数据
     *
     * @param adminAuth 实例对象
     * @return 影响行数
     */
    int update(AdminAuth adminAuth);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}
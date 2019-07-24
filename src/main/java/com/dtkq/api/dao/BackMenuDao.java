package com.dtkq.api.dao;

import com.dtkq.api.entity.BackMenu;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (BackMenu)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 16:22:50
 */
public interface BackMenuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param menuId 主键
     * @return 实例对象
     */
    BackMenu queryById(Integer menuId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BackMenu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param backMenu 实例对象
     * @return 对象列表
     */
    List<BackMenu> queryAll(BackMenu backMenu);

    /**
     * 新增数据
     *
     * @param backMenu 实例对象
     * @return 影响行数
     */
    int insert(BackMenu backMenu);

    /**
     * 修改数据
     *
     * @param backMenu 实例对象
     * @return 影响行数
     */
    int update(BackMenu backMenu);

    /**
     * 通过主键删除数据
     *
     * @param menuId 主键
     * @return 影响行数
     */
    int deleteById(Integer menuId);

}
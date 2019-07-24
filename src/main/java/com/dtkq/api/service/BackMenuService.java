package com.dtkq.api.service;

import com.dtkq.api.entity.BackMenu;
import java.util.List;

/**
 * (BackMenu)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:22:50
 */
public interface BackMenuService {

    /**
     * 通过ID查询单条数据
     *
     * @param menuId 主键
     * @return 实例对象
     */
    BackMenu queryById(Integer menuId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BackMenu> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param backMenu 实例对象
     * @return 实例对象
     */
    BackMenu insert(BackMenu backMenu);

    /**
     * 修改数据
     *
     * @param backMenu 实例对象
     * @return 实例对象
     */
    BackMenu update(BackMenu backMenu);

    /**
     * 通过主键删除数据
     *
     * @param menuId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer menuId);

}
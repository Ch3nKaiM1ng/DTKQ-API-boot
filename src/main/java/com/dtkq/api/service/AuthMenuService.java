package com.dtkq.api.service;

import com.dtkq.api.entity.AuthMenu;
import java.util.List;

/**
 * (AuthMenu)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:22:41
 */
public interface AuthMenuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthMenu queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthMenu> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param authMenu 实例对象
     * @return 实例对象
     */
    AuthMenu insert(AuthMenu authMenu);

    /**
     * 修改数据
     *
     * @param authMenu 实例对象
     * @return 实例对象
     */
    AuthMenu update(AuthMenu authMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
package com.dtkq.api.service.impl;

import com.dtkq.api.entity.BackMenu;
import com.dtkq.api.dao.BackMenuDao;
import com.dtkq.api.service.BackMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BackMenu)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:22:50
 */
@Service("backMenuService")
public class BackMenuServiceImpl implements BackMenuService {
    @Resource
    private BackMenuDao backMenuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param menuId 主键
     * @return 实例对象
     */
    @Override
    public BackMenu queryById(Integer menuId) {
        return this.backMenuDao.queryById(menuId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BackMenu> queryAllByLimit(int offset, int limit) {
        return this.backMenuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param backMenu 实例对象
     * @return 实例对象
     */
    @Override
    public BackMenu insert(BackMenu backMenu) {
        this.backMenuDao.insert(backMenu);
        return backMenu;
    }

    /**
     * 修改数据
     *
     * @param backMenu 实例对象
     * @return 实例对象
     */
    @Override
    public BackMenu update(BackMenu backMenu) {
        this.backMenuDao.update(backMenu);
        return this.queryById(backMenu.getMenuId());
    }

    /**
     * 通过主键删除数据
     *
     * @param menuId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer menuId) {
        return this.backMenuDao.deleteById(menuId) > 0;
    }
}
package com.dtkq.api.service.impl;

import com.dtkq.api.entity.AuthMenu;
import com.dtkq.api.dao.AuthMenuDao;
import com.dtkq.api.service.AuthMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AuthMenu)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:22:41
 */
@Service("authMenuService")
public class AuthMenuServiceImpl implements AuthMenuService {
    @Resource
    private AuthMenuDao authMenuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AuthMenu queryById(Integer id) {
        return this.authMenuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AuthMenu> queryAllByLimit(int offset, int limit) {
        return this.authMenuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param authMenu 实例对象
     * @return 实例对象
     */
    @Override
    public AuthMenu insert(AuthMenu authMenu) {
        this.authMenuDao.insert(authMenu);
        return authMenu;
    }

    /**
     * 修改数据
     *
     * @param authMenu 实例对象
     * @return 实例对象
     */
    @Override
    public AuthMenu update(AuthMenu authMenu) {
        this.authMenuDao.update(authMenu);
        return this.queryById(authMenu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.authMenuDao.deleteById(id) > 0;
    }
}
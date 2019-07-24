package com.dtkq.api.service.impl;

import com.dtkq.api.entity.AdminAuth;
import com.dtkq.api.dao.AdminAuthDao;
import com.dtkq.api.service.AdminAuthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AdminAuth)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:21:18
 */
@Service("adminAuthService")
public class AdminAuthServiceImpl implements AdminAuthService {
    @Resource
    private AdminAuthDao adminAuthDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AdminAuth queryById(Integer id) {
        return this.adminAuthDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AdminAuth> queryAllByLimit(int offset, int limit) {
        return this.adminAuthDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param adminAuth 实例对象
     * @return 实例对象
     */
    @Override
    public AdminAuth insert(AdminAuth adminAuth) {
        this.adminAuthDao.insert(adminAuth);
        return adminAuth;
    }

    /**
     * 修改数据
     *
     * @param adminAuth 实例对象
     * @return 实例对象
     */
    @Override
    public AdminAuth update(AdminAuth adminAuth) {
        this.adminAuthDao.update(adminAuth);
        return this.queryById(adminAuth.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.adminAuthDao.deleteById(id) > 0;
    }
}
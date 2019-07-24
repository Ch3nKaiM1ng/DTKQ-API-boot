package com.dtkq.api.service.impl;

import com.dtkq.api.entity.UserTalkRead;
import com.dtkq.api.dao.UserTalkReadDao;
import com.dtkq.api.service.UserTalkReadService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserTalkRead)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:25:33
 */
@Service("userTalkReadService")
public class UserTalkReadServiceImpl implements UserTalkReadService {
    @Resource
    private UserTalkReadDao userTalkReadDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserTalkRead queryById(Integer id) {
        return this.userTalkReadDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserTalkRead> queryAllByLimit(int offset, int limit) {
        return this.userTalkReadDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userTalkRead 实例对象
     * @return 实例对象
     */
    @Override
    public UserTalkRead insert(UserTalkRead userTalkRead) {
        this.userTalkReadDao.insert(userTalkRead);
        return userTalkRead;
    }

    /**
     * 修改数据
     *
     * @param userTalkRead 实例对象
     * @return 实例对象
     */
    @Override
    public UserTalkRead update(UserTalkRead userTalkRead) {
        this.userTalkReadDao.update(userTalkRead);
        return this.queryById(userTalkRead.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userTalkReadDao.deleteById(id) > 0;
    }
}
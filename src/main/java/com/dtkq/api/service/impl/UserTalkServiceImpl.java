package com.dtkq.api.service.impl;

import com.dtkq.api.entity.UserTalk;
import com.dtkq.api.dao.UserTalkDao;
import com.dtkq.api.service.UserTalkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserTalk)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:25:25
 */
@Service("userTalkService")
public class UserTalkServiceImpl implements UserTalkService {
    @Resource
    private UserTalkDao userTalkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserTalk queryById(Integer id) {
        return this.userTalkDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserTalk> queryAllByLimit(int offset, int limit) {
        return this.userTalkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userTalk 实例对象
     * @return 实例对象
     */
    @Override
    public UserTalk insert(UserTalk userTalk) {
        this.userTalkDao.insert(userTalk);
        return userTalk;
    }

    /**
     * 修改数据
     *
     * @param userTalk 实例对象
     * @return 实例对象
     */
    @Override
    public UserTalk update(UserTalk userTalk) {
        this.userTalkDao.update(userTalk);
        return this.queryById(userTalk.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userTalkDao.deleteById(id) > 0;
    }
}
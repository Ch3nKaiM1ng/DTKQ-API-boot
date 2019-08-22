package com.dtkq.api.service.impl;

import com.dtkq.api.entity.Ask;
import com.dtkq.api.entity.TrackUser;
import com.dtkq.api.dao.TrackUserDao;
import com.dtkq.api.service.TrackUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TrackUser)表服务实现类
 *
 * @author makejava
 * @since 2019-08-20 15:16:37
 */
@Service("trackUserService")
public class TrackUserServiceImpl implements TrackUserService {
    @Resource
    private TrackUserDao trackUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TrackUser queryById(Integer id) {
        return this.trackUserDao.queryById(id);
    }
    @Override
    public TrackUser queryObj(TrackUser trackUser) {
        return this.trackUserDao.queryObj(trackUser);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TrackUser> queryAllByLimit(int offset, int limit) {
        return this.trackUserDao.queryAllByLimit(offset, limit);
    }
    @Override
    public List<TrackUser> queryAll(TrackUser trackUser) {
        return this.trackUserDao.queryAll(trackUser);
    }

    /**
     * 新增数据
     *
     * @param trackUser 实例对象
     * @return 实例对象
     */
    @Override
    public TrackUser insert(TrackUser trackUser) {
        this.trackUserDao.insert(trackUser);
        return trackUser;
    }

    /**
     * 修改数据
     *
     * @param trackUser 实例对象
     * @return 实例对象
     */
    @Override
    public TrackUser update(TrackUser trackUser) {
        this.trackUserDao.update(trackUser);
        return this.queryById(trackUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.trackUserDao.deleteById(id) > 0;
    }
    @Override
    public Integer countNum(TrackUser trackUser) {
        return trackUserDao.countNum(trackUser);
    }
}
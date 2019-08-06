package com.dtkq.api.service.impl;

import com.dtkq.api.entity.Subscribe;
import com.dtkq.api.dao.SubscribeDao;
import com.dtkq.api.service.SubscribeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Subscribe)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:24:30
 */
@Service("subscribeService")
public class SubscribeServiceImpl implements SubscribeService {
    @Resource
    private SubscribeDao subscribeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    @Override
    public Subscribe queryById(Integer sId) {
        return this.subscribeDao.queryById(sId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Subscribe> queryAllByLimit(int offset, int limit) {
        return this.subscribeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param subscribe 实例对象
     * @return 实例对象
     */
    @Override
    public Subscribe insert(Subscribe subscribe) {
        this.subscribeDao.insert(subscribe);
        return subscribe;
    }

    /**
     * 修改数据
     *
     * @param subscribe 实例对象
     * @return 实例对象
     */
    @Override
    public Subscribe update(Subscribe subscribe) {
        this.subscribeDao.update(subscribe);
        return this.queryById(subscribe.getsId());
    }

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sId) {
        return this.subscribeDao.deleteById(sId) > 0;
    }

    @Override
    public List<Subscribe> selectAll() {
        return this.subscribeDao.selectAll();
    }
}
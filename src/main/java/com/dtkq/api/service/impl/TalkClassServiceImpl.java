package com.dtkq.api.service.impl;

import com.dtkq.api.entity.TalkClass;
import com.dtkq.api.dao.TalkClassDao;
import com.dtkq.api.service.TalkClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TalkClass)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:24:49
 */
@Service("talkClassService")
public class TalkClassServiceImpl implements TalkClassService {
    @Resource
    private TalkClassDao talkClassDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TalkClass queryById(Integer id) {
        return this.talkClassDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TalkClass> queryAllByLimit(int offset, int limit) {
        return this.talkClassDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param talkClass 实例对象
     * @return 实例对象
     */
    @Override
    public TalkClass insert(TalkClass talkClass) {
        this.talkClassDao.insert(talkClass);
        return talkClass;
    }

    /**
     * 修改数据
     *
     * @param talkClass 实例对象
     * @return 实例对象
     */
    @Override
    public TalkClass update(TalkClass talkClass) {
        this.talkClassDao.update(talkClass);
        return this.queryById(talkClass.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.talkClassDao.deleteById(id) > 0;
    }
}
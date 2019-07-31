package com.dtkq.api.service.impl;

import com.dtkq.api.entity.Article;
import com.dtkq.api.entity.Ask;
import com.dtkq.api.dao.AskDao;
import com.dtkq.api.service.AskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Ask)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:21:56
 */
@Service("askService")
public class AskServiceImpl implements AskService {
    @Resource
    private AskDao askDao;

    /**
     * 通过ID查询单条数据
     *
     * @param askId 主键
     * @return 实例对象
     */
    @Override
    public Ask queryById(Integer askId) {
        return this.askDao.queryById(askId);
    }
    @Override
    public Ask addNum(Ask ask) {
        this.askDao.addNum(ask);
        return this.queryById(ask.getAskId());
    }
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Ask> queryAllByLimit(int offset, int limit) {
        return this.askDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ask 实例对象
     * @return 实例对象
     */
    @Override
    public Ask insert(Ask ask) {
        this.askDao.insert(ask);
        return ask;
    }

    /**
     * 修改数据
     *
     * @param ask 实例对象
     * @return 实例对象
     */
    @Override
    public Ask update(Ask ask) {
        this.askDao.update(ask);
        return this.queryById(ask.getAskId());
    }

    /**
     * 通过主键删除数据
     *
     * @param askId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer askId) {
        return this.askDao.deleteById(askId) > 0;
    }
    @Override
    public Integer countNum(Ask ask) {
        return askDao.countNum(ask);
    }

}
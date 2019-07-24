package com.dtkq.api.service.impl;

import com.dtkq.api.entity.AskThumbs;
import com.dtkq.api.dao.AskThumbsDao;
import com.dtkq.api.service.AskThumbsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AskThumbs)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:22:36
 */
@Service("askThumbsService")
public class AskThumbsServiceImpl implements AskThumbsService {
    @Resource
    private AskThumbsDao askThumbsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AskThumbs queryById(Integer id) {
        return this.askThumbsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AskThumbs> queryAllByLimit(int offset, int limit) {
        return this.askThumbsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param askThumbs 实例对象
     * @return 实例对象
     */
    @Override
    public AskThumbs insert(AskThumbs askThumbs) {
        this.askThumbsDao.insert(askThumbs);
        return askThumbs;
    }

    /**
     * 修改数据
     *
     * @param askThumbs 实例对象
     * @return 实例对象
     */
    @Override
    public AskThumbs update(AskThumbs askThumbs) {
        this.askThumbsDao.update(askThumbs);
        return this.queryById(askThumbs.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.askThumbsDao.deleteById(id) > 0;
    }
}
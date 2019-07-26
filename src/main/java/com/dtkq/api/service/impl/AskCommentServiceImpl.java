package com.dtkq.api.service.impl;

import com.dtkq.api.entity.AskComment;
import com.dtkq.api.dao.AskCommentDao;
import com.dtkq.api.service.AskCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AskComment)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:22:22
 */
@Service("askCommentService")
public class AskCommentServiceImpl implements AskCommentService {
    @Resource
    private AskCommentDao askCommentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AskComment queryById(Integer id) {
        return this.askCommentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AskComment> queryAllByLimit(int offset, int limit) {
        return this.askCommentDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<AskComment> queryAll(AskComment askComment) {
        return this.askCommentDao.queryAll(askComment);
    }

    /**
     * 新增数据
     *
     * @param askComment 实例对象
     * @return 实例对象
     */
    @Override
    public AskComment insert(AskComment askComment) {
        this.askCommentDao.insert(askComment);
        return askComment;
    }

    /**
     * 修改数据
     *
     * @param askComment 实例对象
     * @return 实例对象
     */
    @Override
    public AskComment update(AskComment askComment) {
        this.askCommentDao.update(askComment);
        return this.queryById(askComment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.askCommentDao.deleteById(id) > 0;
    }
}
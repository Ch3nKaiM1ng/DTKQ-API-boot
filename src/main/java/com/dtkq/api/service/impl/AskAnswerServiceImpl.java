package com.dtkq.api.service.impl;

import com.dtkq.api.entity.AskAnswer;
import com.dtkq.api.dao.AskAnswerDao;
import com.dtkq.api.service.AskAnswerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AskAnswer)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:22:08
 */
@Service("askAnswerService")
public class AskAnswerServiceImpl implements AskAnswerService {
    @Resource
    private AskAnswerDao askAnswerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AskAnswer queryById(Integer id) {
        return this.askAnswerDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AskAnswer> queryAllByLimit(int offset, int limit) {
        return this.askAnswerDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<AskAnswer> queryAll(AskAnswer askAnswer) {
        return this.askAnswerDao.queryAll(askAnswer);
    }

    /**
     * 新增数据
     *
     * @param askAnswer 实例对象
     * @return 实例对象
     */
    @Override
    public AskAnswer insert(AskAnswer askAnswer) {
        this.askAnswerDao.insert(askAnswer);
        return askAnswer;
    }

    /**
     * 修改数据
     *
     * @param askAnswer 实例对象
     * @return 实例对象
     */
    @Override
    public AskAnswer update(AskAnswer askAnswer) {
        this.askAnswerDao.update(askAnswer);
        return this.queryById(askAnswer.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.askAnswerDao.deleteById(id) > 0;
    }
}
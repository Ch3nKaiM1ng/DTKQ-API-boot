package com.dtkq.api.service.impl;

import com.dtkq.api.entity.AskComment;
import com.dtkq.api.entity.CaseComment;
import com.dtkq.api.dao.CaseCommentDao;
import com.dtkq.api.service.CaseCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CaseComment)表服务实现类
 *
 * @author makejava
 * @since 2019-07-26 17:39:28
 */
@Service("caseCommentService")
public class CaseCommentServiceImpl implements CaseCommentService {
    @Resource
    private CaseCommentDao caseCommentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CaseComment queryById(Integer id) {
        return this.caseCommentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CaseComment> queryAllByLimit(int offset, int limit) {
        return this.caseCommentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param caseComment 实例对象
     * @return 实例对象
     */
    @Override
    public CaseComment insert(CaseComment caseComment) {
        this.caseCommentDao.insert(caseComment);
        return caseComment;
    }

    /**
     * 修改数据
     *
     * @param caseComment 实例对象
     * @return 实例对象
     */
    @Override
    public CaseComment update(CaseComment caseComment) {
        this.caseCommentDao.update(caseComment);
        return this.queryById(caseComment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.caseCommentDao.deleteById(id) > 0;
    }

    @Override
    public boolean addNum(CaseComment entity) {
        return this.caseCommentDao.addNum(entity) > 0;
    }
    @Override
    public Integer countNum(CaseComment entity) {
        return caseCommentDao.countNum(entity);
    }
    @Override
    public List<CaseComment> findAllData(CaseComment entity) {

        List<CaseComment>  list =  this.caseCommentDao.findAllData(entity);
        return list;
    }
    @Override
    public List<CaseComment> queryAll(CaseComment entity) {
        return this.caseCommentDao.queryAll(entity);
    }

}
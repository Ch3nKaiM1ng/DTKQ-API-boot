package com.dtkq.api.service.impl;

import com.dtkq.api.dao.CaseDao;
import com.dtkq.api.entity.Case;
import com.dtkq.api.service.CaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Case)表服务实现类
 *
 * @author makejava
 * @since 2019-07-26 17:38:48
 */
@Service("caseService")
public class CaseServiceImpl implements CaseService {
    @Resource
    private CaseDao caseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Case queryById(Integer id) {
        return this.caseDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Case> queryAllByLimit(int offset, int limit) {
        return this.caseDao.queryAllByLimit(offset, limit);
    }
    @Override
    public List<Case> queryAll(Case entity) {
        return this.caseDao.queryAll(entity);
    }
    @Override
    public List<Case> queryByfunction(Case entity) {
        return this.caseDao.queryByfunction(entity);
    }
    /**
     * 新增数据
     *
     * @param entity 实例对象
     * @return 实例对象
     */
    @Override
    public Case insert(Case entity) {
        this.caseDao.insert(entity);
        return entity;
    }

    /**
     * 修改数据
     *
     * @param entity 实例对象
     * @return 实例对象
     */
    @Override
    public Case update(Case entity) {
        this.caseDao.update(entity);
        return this.queryById(entity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.caseDao.deleteById(id) > 0;
    }
    @Override
    public Case addNum(Case entity) {
        this.caseDao.addNum(entity);
        return this.queryById(entity.getId());
    }
    @Override
    public Integer countNum(Case entity) {
        return caseDao.countNum(entity);
    }
    @Override
    public Integer countFunction(Case entity) {
        return caseDao.countFunction(entity);
    }

    @Override
    public List<Case> selectByKeyWord(String keyword, Integer offset, Integer limit) {
        return this.caseDao.selectByKeyWord(keyword,offset,limit);
    }
}
package com.dtkq.api.service.impl;

import com.dtkq.api.entity.CaseDetail;
import com.dtkq.api.dao.CaseDetailDao;
import com.dtkq.api.service.CaseDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CaseDetail)表服务实现类
 *
 * @author makejava
 * @since 2019-07-26 17:39:28
 */
@Service("caseDetailService")
public class CaseDetailServiceImpl implements CaseDetailService {
    @Resource
    private CaseDetailDao caseDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CaseDetail queryById(Integer id) {
        return this.caseDetailDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CaseDetail> queryAllByLimit(int offset, int limit) {
        return this.caseDetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param caseDetail 实例对象
     * @return 实例对象
     */
    @Override
    public CaseDetail insert(CaseDetail caseDetail) {
        this.caseDetailDao.insert(caseDetail);
        return caseDetail;
    }

    /**
     * 修改数据
     *
     * @param caseDetail 实例对象
     * @return 实例对象
     */
    @Override
    public CaseDetail update(CaseDetail caseDetail) {
        this.caseDetailDao.update(caseDetail);
        return this.queryById(caseDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.caseDetailDao.deleteById(id) > 0;
    }
}
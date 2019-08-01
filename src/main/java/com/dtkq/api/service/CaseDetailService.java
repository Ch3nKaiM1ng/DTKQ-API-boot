package com.dtkq.api.service;

import com.dtkq.api.entity.CaseDetail;
import java.util.List;

/**
 * (CaseDetail)表服务接口
 *
 * @author makejava
 * @since 2019-07-26 17:39:28
 */
public interface CaseDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CaseDetail queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CaseDetail> queryAllByLimit(int offset, int limit);
    List<CaseDetail> queryAll(CaseDetail caseDetail);
    /**
     * 新增数据
     *
     * @param caseDetail 实例对象
     * @return 实例对象
     */
    CaseDetail insert(CaseDetail caseDetail);

    /**
     * 修改数据
     *
     * @param caseDetail 实例对象
     * @return 实例对象
     */
    CaseDetail update(CaseDetail caseDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
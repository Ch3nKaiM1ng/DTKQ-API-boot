package com.dtkq.api.service;

import com.dtkq.api.entity.AskComment;
import com.dtkq.api.entity.CaseComment;
import java.util.List;

/**
 * (CaseComment)表服务接口
 *
 * @author makejava
 * @since 2019-07-26 17:39:28
 */
public interface CaseCommentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CaseComment queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CaseComment> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param caseComment 实例对象
     * @return 实例对象
     */
    CaseComment insert(CaseComment caseComment);

    /**
     * 修改数据
     *
     * @param caseComment 实例对象
     * @return 实例对象
     */
    CaseComment update(CaseComment caseComment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    boolean addNum(CaseComment entity);
    Integer countNum(CaseComment entity);
    List<CaseComment> queryAll(CaseComment entity);
    List<CaseComment> findAllData(CaseComment entity);
}
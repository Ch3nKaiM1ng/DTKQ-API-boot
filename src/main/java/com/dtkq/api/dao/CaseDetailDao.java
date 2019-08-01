package com.dtkq.api.dao;

import com.dtkq.api.entity.CaseDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (CaseDetail)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-26 17:39:28
 */
public interface CaseDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CaseDetail queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CaseDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param caseDetail 实例对象
     * @return 对象列表
     */
    List<CaseDetail> queryAll(CaseDetail caseDetail);

    /**
     * 新增数据
     *
     * @param caseDetail 实例对象
     * @return 影响行数
     */
    int insert(CaseDetail caseDetail);

    /**
     * 修改数据
     *
     * @param caseDetail 实例对象
     * @return 影响行数
     */
    int update(CaseDetail caseDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
    List<CaseDetail> queryAllById(Integer id);
}
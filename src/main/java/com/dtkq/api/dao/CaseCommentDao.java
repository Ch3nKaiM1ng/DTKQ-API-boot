package com.dtkq.api.dao;

import com.dtkq.api.entity.AskComment;
import com.dtkq.api.entity.CaseComment;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (CaseComment)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-26 17:39:28
 */
public interface CaseCommentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CaseComment queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CaseComment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param caseComment 实例对象
     * @return 对象列表
     */
    List<CaseComment> queryAll(CaseComment caseComment);

    /**
     * 新增数据
     *
     * @param caseComment 实例对象
     * @return 影响行数
     */
    int insert(CaseComment caseComment);

    /**
     * 修改数据
     *
     * @param caseComment 实例对象
     * @return 影响行数
     */
    int update(CaseComment caseComment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
    int addNum(CaseComment askComment);
    int countNum(CaseComment askComment);
    List<CaseComment> findAllData(CaseComment articleComment);
    List<CaseComment> findSonList(CaseComment articleComment);
}
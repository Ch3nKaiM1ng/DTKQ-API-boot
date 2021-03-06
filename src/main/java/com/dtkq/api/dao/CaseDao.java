package com.dtkq.api.dao;

import com.dtkq.api.entity.Case;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Case)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-26 17:38:48
 */
public interface CaseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Case queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Case> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param entity 实例对象
     * @return 对象列表
     */
    List<Case> queryAll(Case entity);
    List<Case> queryByfunction(Case entity);
    int addNum(Case entity);
    /**
     * 新增数据
     *
     * @param entity 实例对象
     * @return 影响行数
     */
    int insert(Case entity);

    /**
     * 修改数据
     *
     * @param entity 实例对象
     * @return 影响行数
     */
    int update(Case entity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
    int countNum(Case entity);
    int countFunction(Case entity);
    int countCommentNum(Integer id);

    List<Case> selectByKeyWord(String keyword, Integer offset, Integer limit);
}
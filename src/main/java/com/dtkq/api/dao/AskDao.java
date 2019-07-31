package com.dtkq.api.dao;

import com.dtkq.api.entity.Article;
import com.dtkq.api.entity.Ask;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Ask)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 16:21:56
 */
public interface AskDao {

    /**
     * 通过ID查询单条数据
     *
     * @param askId 主键
     * @return 实例对象
     */
    Ask queryById(Integer askId);

    int addNum(Ask ask);
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Ask> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ask 实例对象
     * @return 对象列表
     */
    List<Ask> queryAll(Ask ask);

    /**
     * 新增数据
     *
     * @param ask 实例对象
     * @return 影响行数
     */
    int insert(Ask ask);

    /**
     * 修改数据
     *
     * @param ask 实例对象
     * @return 影响行数
     */
    int update(Ask ask);

    /**
     * 通过主键删除数据
     *
     * @param askId 主键
     * @return 影响行数
     */
    int deleteById(Integer askId);
    int countNum(Ask ask);
}
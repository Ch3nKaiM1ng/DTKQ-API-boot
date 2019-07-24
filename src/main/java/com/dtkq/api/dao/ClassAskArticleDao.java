package com.dtkq.api.dao;

import com.dtkq.api.entity.ClassAskArticle;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ClassAskArticle)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 16:23:11
 */
public interface ClassAskArticleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param acId 主键
     * @return 实例对象
     */
    ClassAskArticle queryById(Integer acId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ClassAskArticle> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param classAskArticle 实例对象
     * @return 对象列表
     */
    List<ClassAskArticle> queryAll(ClassAskArticle classAskArticle);

    /**
     * 新增数据
     *
     * @param classAskArticle 实例对象
     * @return 影响行数
     */
    int insert(ClassAskArticle classAskArticle);

    /**
     * 修改数据
     *
     * @param classAskArticle 实例对象
     * @return 影响行数
     */
    int update(ClassAskArticle classAskArticle);

    /**
     * 通过主键删除数据
     *
     * @param acId 主键
     * @return 影响行数
     */
    int deleteById(Integer acId);

}
package com.dtkq.api.dao;

import com.dtkq.api.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Article)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 17:11:28
 */
public interface ArticleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param artId 主键
     * @return 实例对象
     */
    Article queryById(Integer artId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Article> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param article 实例对象
     * @return 对象列表
     */
    List<Article> queryAll(Article article);

    /**
     * 新增数据
     *
     * @param article 实例对象
     * @return 影响行数
     */
    int insert(Article article);

    /**
     * 修改数据
     *
     * @param article 实例对象
     * @return 影响行数
     */
    int update(Article article);

    int addNum(Article article);

    /**
     * 通过主键删除数据
     *
     * @param artId 主键
     * @return 影响行数
     */
    int deleteById(Integer artId);
    int countNum(Article article);

    List<Article> selectByKeyWord(@Param("keyword") String keyword, @Param("offset") Integer offset, @Param("limit") Integer limit);

    Integer selectByKeyWordNum(@Param("keyword")String keyword);
}
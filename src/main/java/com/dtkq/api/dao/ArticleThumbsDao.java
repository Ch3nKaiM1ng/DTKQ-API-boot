package com.dtkq.api.dao;

import com.dtkq.api.entity.ArticleThumbs;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ArticleThumbs)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 16:21:50
 */
public interface ArticleThumbsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ArticleThumbs queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ArticleThumbs> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param articleThumbs 实例对象
     * @return 对象列表
     */
    List<ArticleThumbs> queryAll(ArticleThumbs articleThumbs);

    /**
     * 新增数据
     *
     * @param articleThumbs 实例对象
     * @return 影响行数
     */
    int insert(ArticleThumbs articleThumbs);

    /**
     * 修改数据
     *
     * @param articleThumbs 实例对象
     * @return 影响行数
     */
    int update(ArticleThumbs articleThumbs);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}
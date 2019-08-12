package com.dtkq.api.dao;

import com.dtkq.api.entity.ArticleComment;
import com.dtkq.api.entity.AskAnswer;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ArticleComment)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 16:21:37
 */
public interface ArticleCommentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ArticleComment queryById(Integer id);
    ArticleComment findSonObj(Integer id);
    ArticleComment findSonList(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ArticleComment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param articleComment 实例对象
     * @return 对象列表
     */
    List<ArticleComment> queryAll(ArticleComment articleComment);

    List<ArticleComment> findAllData(ArticleComment articleComment);

    /**
     * 新增数据
     *
     * @param articleComment 实例对象
     * @return 影响行数
     */
    int insert(ArticleComment articleComment);

    /**
     * 修改数据
     *
     * @param articleComment 实例对象
     * @return 影响行数
     */
    int update(ArticleComment articleComment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
     int countNum(ArticleComment articleComment);
     int countNumByArt(Integer id);
    int addNum(ArticleComment articleComment);
}
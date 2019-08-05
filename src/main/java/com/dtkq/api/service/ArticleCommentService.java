package com.dtkq.api.service;

import com.dtkq.api.entity.ArticleComment;
import com.dtkq.api.entity.AskAnswer;

import java.util.List;

/**
 * (ArticleComment)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:21:37
 */
public interface ArticleCommentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ArticleComment queryById(Integer id);
    List<ArticleComment> queryAllByLimit(ArticleComment entity);
    List<ArticleComment> findAllData(ArticleComment entity);

    ArticleComment findSonObj(Integer id);


    /**
     * 新增数据
     *
     * @param articleComment 实例对象
     * @return 实例对象
     */
    ArticleComment insert(ArticleComment articleComment);

    /**
     * 修改数据
     *
     * @param articleComment 实例对象
     * @return 实例对象
     */
    ArticleComment update(ArticleComment articleComment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    ArticleComment addNum(ArticleComment ask);
    Integer countNum(ArticleComment ask);
}
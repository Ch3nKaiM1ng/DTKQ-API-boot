package com.dtkq.api.service;

import com.dtkq.api.entity.Article;

import java.util.List;

/**
 * (Article)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 17:11:28
 */
public interface ArticleService {

    /**
     * 通过ID查询单条数据
     *
     * @param artId 主键
     * @return 实例对象
     */
    Article queryById(Integer artId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Article> queryAllByLimit(int offset, int limit);

    List<Article> queryAll(Article article);

    /**
     * 新增数据
     *
     * @param article 实例对象
     * @return 实例对象
     */
    Article insert(Article article);

    /**
     * 修改数据
     *
     * @param article 实例对象
     * @return 实例对象
     */
    Article update(Article article);

    Article addNum(Article article);
    /**
     * 通过主键删除数据
     *
     * @param artId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer artId);
    Integer countNum(Article article);

    List<Article> selectByKeyWord(String keyword, Integer offset, Integer limit);

    Integer selectByKeyWordNum(String keyword);
}
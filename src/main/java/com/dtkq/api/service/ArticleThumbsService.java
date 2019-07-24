package com.dtkq.api.service;

import com.dtkq.api.entity.ArticleThumbs;
import java.util.List;

/**
 * (ArticleThumbs)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:21:50
 */
public interface ArticleThumbsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ArticleThumbs queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ArticleThumbs> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param articleThumbs 实例对象
     * @return 实例对象
     */
    ArticleThumbs insert(ArticleThumbs articleThumbs);

    /**
     * 修改数据
     *
     * @param articleThumbs 实例对象
     * @return 实例对象
     */
    ArticleThumbs update(ArticleThumbs articleThumbs);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
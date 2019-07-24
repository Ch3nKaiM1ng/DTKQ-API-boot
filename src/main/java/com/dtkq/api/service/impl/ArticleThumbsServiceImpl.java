package com.dtkq.api.service.impl;

import com.dtkq.api.entity.ArticleThumbs;
import com.dtkq.api.dao.ArticleThumbsDao;
import com.dtkq.api.service.ArticleThumbsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ArticleThumbs)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:21:50
 */
@Service("articleThumbsService")
public class ArticleThumbsServiceImpl implements ArticleThumbsService {
    @Resource
    private ArticleThumbsDao articleThumbsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ArticleThumbs queryById(Integer id) {
        return this.articleThumbsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ArticleThumbs> queryAllByLimit(int offset, int limit) {
        return this.articleThumbsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param articleThumbs 实例对象
     * @return 实例对象
     */
    @Override
    public ArticleThumbs insert(ArticleThumbs articleThumbs) {
        this.articleThumbsDao.insert(articleThumbs);
        return articleThumbs;
    }

    /**
     * 修改数据
     *
     * @param articleThumbs 实例对象
     * @return 实例对象
     */
    @Override
    public ArticleThumbs update(ArticleThumbs articleThumbs) {
        this.articleThumbsDao.update(articleThumbs);
        return this.queryById(articleThumbs.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.articleThumbsDao.deleteById(id) > 0;
    }
}
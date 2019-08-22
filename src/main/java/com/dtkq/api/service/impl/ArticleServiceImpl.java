package com.dtkq.api.service.impl;

import com.dtkq.api.dao.ArticleDao;
import com.dtkq.api.entity.Article;
import com.dtkq.api.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Article)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 17:11:28
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleDao articleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param artId 主键
     * @return 实例对象
     */
    @Override
    public Article queryById(Integer artId) {
        return this.articleDao.queryById(artId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Article> queryAllByLimit(int offset, int limit) {
        return this.articleDao.queryAllByLimit(offset, limit);
    }
    @Override
    public List<Article> queryAll(Article article) {
        return this.articleDao.queryAll(article);
    }

    /**
     * 新增数据
     *
     * @param article 实例对象
     * @return 实例对象
     */
    @Override
    public Article insert(Article article) {
        this.articleDao.insert(article);
        return article;
    }

    /**
     * 修改数据
     *
     * @param article 实例对象
     * @return 实例对象
     */
    @Override
    public Article update(Article article) {
        this.articleDao.update(article);
        return this.queryById(article.getArtId());
    }

    @Override
    public Article addNum(Article article) {
        this.articleDao.addNum(article);
        return this.queryById(article.getArtId());
    }

    /**
     * 通过主键删除数据
     *
     * @param artId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer artId) {
        return this.articleDao.deleteById(artId) > 0;
    }


    @Override
    public Integer countNum(Article article) {
        return articleDao.countNum(article);
    }

    @Override
    public List<Article> selectByKeyWord(String keyword, Integer offset, Integer limit) {
        return this.articleDao.selectByKeyWord(keyword,offset,limit);
    }

    @Override
    public Integer selectByKeyWordNum(String keyword) {
        return this.articleDao.selectByKeyWordNum(keyword);
    }
}
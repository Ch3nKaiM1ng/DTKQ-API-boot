package com.dtkq.api.service.impl;

import com.dtkq.api.entity.ClassAskArticle;
import com.dtkq.api.dao.ClassAskArticleDao;
import com.dtkq.api.service.ClassAskArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ClassAskArticle)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 17:40:11
 */
@Service("classAskArticleService")
public class ClassAskArticleServiceImpl implements ClassAskArticleService {
    @Resource
    private ClassAskArticleDao classAskArticleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param acId 主键
     * @return 实例对象
     */
    @Override
    public ClassAskArticle queryById(Integer acId) {
        return this.classAskArticleDao.queryById(acId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ClassAskArticle> queryAllByLimit(int offset, int limit) {
        return this.classAskArticleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param classAskArticle 实例对象
     * @return 实例对象
     */
    @Override
    public ClassAskArticle insert(ClassAskArticle classAskArticle) {
        this.classAskArticleDao.insert(classAskArticle);
        return classAskArticle;
    }

    /**
     * 修改数据
     *
     * @param classAskArticle 实例对象
     * @return 实例对象
     */
    @Override
    public int update(ClassAskArticle classAskArticle) {
        this.classAskArticleDao.update(classAskArticle);
        return classAskArticle.getAcId();
    }

    /**
     * 通过主键删除数据
     *
     * @param acId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer acId) {
        return this.classAskArticleDao.deleteById(acId) > 0;
    }

    @Override
    public List<ClassAskArticle> queryAll(ClassAskArticle askArticle) {

        return this.classAskArticleDao.queryAll(askArticle);
    }
    @Override
    public ClassAskArticle queryArtCount(ClassAskArticle askArticle) {

        return this.classAskArticleDao.queryArtCount(askArticle);
    }
    @Override
    public ClassAskArticle queryAskCount(ClassAskArticle askArticle) {

        return this.classAskArticleDao.queryAskCount(askArticle);
    }
}
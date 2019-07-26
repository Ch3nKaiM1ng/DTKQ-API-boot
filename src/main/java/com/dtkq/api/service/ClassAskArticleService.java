package com.dtkq.api.service;

import com.dtkq.api.entity.ClassAskArticle;
import java.util.List;

/**
 * (ClassAskArticle)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 17:40:11
 */
public interface ClassAskArticleService {

    /**
     * 通过ID查询单条数据
     *
     * @param acId 主键
     * @return 实例对象
     */
    ClassAskArticle queryById(Integer acId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ClassAskArticle> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param classAskArticle 实例对象
     * @return 实例对象
     */
    ClassAskArticle insert(ClassAskArticle classAskArticle);

    /**
     * 修改数据
     *
     * @param classAskArticle 实例对象
     * @return 实例对象
     */
    ClassAskArticle update(ClassAskArticle classAskArticle);

    /**
     * 通过主键删除数据
     *
     * @param acId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer acId);

//    根据对象查询
    void queryAll(ClassAskArticle askArticle);
}
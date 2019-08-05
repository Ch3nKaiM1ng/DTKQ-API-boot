package com.dtkq.api.service;

import com.dtkq.api.entity.ArticleComment;
import com.dtkq.api.entity.Ask;
import com.dtkq.api.entity.AskAnswer;
import com.dtkq.api.entity.AskComment;
import java.util.List;

/**
 * (AskComment)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:22:22
 */
public interface AskCommentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AskComment queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AskComment> queryAllByLimit(int offset, int limit);

    List<AskComment> queryAll(AskComment askComment);
    List<AskComment> findAllData(AskComment entity);
    /**
     * 新增数据
     *
     * @param askComment 实例对象
     * @return 实例对象
     */
    AskComment insert(AskComment askComment);

    /**
     * 修改数据
     *
     * @param askComment 实例对象
     * @return 实例对象
     */
    AskComment update(AskComment askComment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    AskComment addNum(AskComment ask);
    Integer countNum(AskComment ask);
}
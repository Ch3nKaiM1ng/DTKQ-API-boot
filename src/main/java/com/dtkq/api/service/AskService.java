package com.dtkq.api.service;

import com.dtkq.api.entity.Article;
import com.dtkq.api.entity.Ask;
import java.util.List;

/**
 * (Ask)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:21:56
 */
public interface AskService {

    /**
     * 通过ID查询单条数据
     *
     * @param askId 主键
     * @return 实例对象
     */
    Ask queryById(Integer askId);


    Ask addNum(Ask ask);
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Ask> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ask 实例对象
     * @return 实例对象
     */
    Ask insert(Ask ask);

    /**
     * 修改数据
     *
     * @param ask 实例对象
     * @return 实例对象
     */
    Ask update(Ask ask);

    /**
     * 通过主键删除数据
     *
     * @param askId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer askId);
    Integer countNum(Ask ask);
}
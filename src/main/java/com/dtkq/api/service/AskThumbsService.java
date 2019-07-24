package com.dtkq.api.service;

import com.dtkq.api.entity.AskThumbs;
import java.util.List;

/**
 * (AskThumbs)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:22:36
 */
public interface AskThumbsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AskThumbs queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AskThumbs> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param askThumbs 实例对象
     * @return 实例对象
     */
    AskThumbs insert(AskThumbs askThumbs);

    /**
     * 修改数据
     *
     * @param askThumbs 实例对象
     * @return 实例对象
     */
    AskThumbs update(AskThumbs askThumbs);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
package com.dtkq.api.service;

import com.dtkq.api.entity.TopImg;
import java.util.List;

/**
 * (TopImg)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:24:57
 */
public interface TopImgService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TopImg queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TopImg> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param topImg 实例对象
     * @return 实例对象
     */
    TopImg insert(TopImg topImg);

    /**
     * 修改数据
     *
     * @param topImg 实例对象
     * @return 实例对象
     */
    TopImg update(TopImg topImg);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
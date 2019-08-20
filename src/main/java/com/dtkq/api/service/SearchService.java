package com.dtkq.api.service;

import com.dtkq.api.entity.Search;
import java.util.List;

/**
 * (Search)表服务接口
 *
 * @author makejava
 * @since 2019-08-17 15:35:34
 */
public interface SearchService {

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    Search queryById(Integer sId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @param s
     * @return 对象列表
     */
    List<Search> queryAllByLimit(int offset, int limit, String sBlong);

    /**
     * 新增数据
     *
     * @param search 实例对象
     * @return 实例对象
     */
    Search insert(Search search);

    /**
     * 修改数据
     *
     * @param search 实例对象
     * @return 实例对象
     */
    int update(Search search);

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sId);

    int queryCount(String sBlong);
}
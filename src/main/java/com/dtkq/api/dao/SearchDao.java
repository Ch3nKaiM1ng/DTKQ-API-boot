package com.dtkq.api.dao;

import com.dtkq.api.entity.Search;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Search)表数据库访问层
 *
 * @author makejava
 * @since 2019-08-17 15:35:34
 */
public interface SearchDao {

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    Search queryById(Integer sId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @param sBlong
     * @return 对象列表
     */
    List<Search> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit, @Param("sBlong")String sBlong);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param search 实例对象
     * @return 对象列表
     */
    List<Search> queryAll(Search search);

    /**
     * 新增数据
     *
     * @param search 实例对象
     * @return 影响行数
     */
    int insert(Search search);

    /**
     * 修改数据
     *
     * @param search 实例对象
     * @return 影响行数
     */
    int update(Search search);

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 影响行数
     */
    int deleteById(Integer sId);

    int queryCount(@Param("sBlong")String sBlong);
}
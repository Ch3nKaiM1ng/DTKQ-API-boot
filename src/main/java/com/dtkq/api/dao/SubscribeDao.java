package com.dtkq.api.dao;

import com.dtkq.api.entity.Subscribe;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Subscribe)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 16:24:30
 */
public interface SubscribeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    Subscribe queryById(Integer sId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Subscribe> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit,@Param("sState") Integer sState);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param subscribe 实例对象
     * @return 对象列表
     */
    List<Subscribe> queryAll(Subscribe subscribe);

    /**
     * 新增数据
     *
     * @param subscribe 实例对象
     * @return 影响行数
     */
    int insert(Subscribe subscribe);

    /**
     * 修改数据
     *
     * @param subscribe 实例对象
     * @return 影响行数
     */
    int update(Subscribe subscribe);

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 影响行数
     */
    int deleteById(Integer sId);

    List<Subscribe> selectAll();

    Integer queryCount(Subscribe subscribe);
}
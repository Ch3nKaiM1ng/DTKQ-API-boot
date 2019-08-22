package com.dtkq.api.dao;

import com.dtkq.api.entity.Ask;
import com.dtkq.api.entity.TrackUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TrackUser)表数据库访问层
 *
 * @author makejava
 * @since 2019-08-20 15:16:37
 */
public interface TrackUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TrackUser queryById(Integer id);
    TrackUser queryObj(TrackUser trackUser);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TrackUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param trackUser 实例对象
     * @return 对象列表
     */
    List<TrackUser> queryAll(TrackUser trackUser);

    /**
     * 新增数据
     *
     * @param trackUser 实例对象
     * @return 影响行数
     */
    int insert(TrackUser trackUser);

    /**
     * 修改数据
     *
     * @param trackUser 实例对象
     * @return 影响行数
     */
    int update(TrackUser trackUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
    int countNum(TrackUser trackUser);
}
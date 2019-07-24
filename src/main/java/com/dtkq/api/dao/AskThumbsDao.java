package com.dtkq.api.dao;

import com.dtkq.api.entity.AskThumbs;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (AskThumbs)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 16:22:36
 */
public interface AskThumbsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AskThumbs queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AskThumbs> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param askThumbs 实例对象
     * @return 对象列表
     */
    List<AskThumbs> queryAll(AskThumbs askThumbs);

    /**
     * 新增数据
     *
     * @param askThumbs 实例对象
     * @return 影响行数
     */
    int insert(AskThumbs askThumbs);

    /**
     * 修改数据
     *
     * @param askThumbs 实例对象
     * @return 影响行数
     */
    int update(AskThumbs askThumbs);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}
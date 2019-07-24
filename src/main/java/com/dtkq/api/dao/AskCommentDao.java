package com.dtkq.api.dao;

import com.dtkq.api.entity.AskComment;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (AskComment)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 16:22:22
 */
public interface AskCommentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AskComment queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AskComment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param askComment 实例对象
     * @return 对象列表
     */
    List<AskComment> queryAll(AskComment askComment);

    /**
     * 新增数据
     *
     * @param askComment 实例对象
     * @return 影响行数
     */
    int insert(AskComment askComment);

    /**
     * 修改数据
     *
     * @param askComment 实例对象
     * @return 影响行数
     */
    int update(AskComment askComment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}
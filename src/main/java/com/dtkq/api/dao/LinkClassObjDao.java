package com.dtkq.api.dao;

import com.dtkq.api.entity.LinkClassObj;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (LinkClassObj)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 16:24:12
 */
public interface LinkClassObjDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LinkClassObj queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LinkClassObj> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param linkClassObj 实例对象
     * @return 对象列表
     */
    List<LinkClassObj> queryAll(LinkClassObj linkClassObj);

    /**
     * 新增数据
     *
     * @param linkClassObj 实例对象
     * @return 影响行数
     */
    int insert(LinkClassObj linkClassObj);

    /**
     * 修改数据
     *
     * @param linkClassObj 实例对象
     * @return 影响行数
     */
    int update(LinkClassObj linkClassObj);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}
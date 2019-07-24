package com.dtkq.api.dao;

import com.dtkq.api.entity.UserTalk;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (UserTalk)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 16:25:25
 */
public interface UserTalkDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserTalk queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserTalk> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userTalk 实例对象
     * @return 对象列表
     */
    List<UserTalk> queryAll(UserTalk userTalk);

    /**
     * 新增数据
     *
     * @param userTalk 实例对象
     * @return 影响行数
     */
    int insert(UserTalk userTalk);

    /**
     * 修改数据
     *
     * @param userTalk 实例对象
     * @return 影响行数
     */
    int update(UserTalk userTalk);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}
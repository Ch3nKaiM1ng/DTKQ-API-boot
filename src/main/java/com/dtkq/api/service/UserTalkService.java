package com.dtkq.api.service;

import com.dtkq.api.entity.UserTalk;
import java.util.List;

/**
 * (UserTalk)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:25:25
 */
public interface UserTalkService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserTalk queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserTalk> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userTalk 实例对象
     * @return 实例对象
     */
    UserTalk insert(UserTalk userTalk);

    /**
     * 修改数据
     *
     * @param userTalk 实例对象
     * @return 实例对象
     */
    UserTalk update(UserTalk userTalk);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
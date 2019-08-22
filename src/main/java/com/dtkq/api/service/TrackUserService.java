package com.dtkq.api.service;

import com.dtkq.api.entity.Ask;
import com.dtkq.api.entity.TrackUser;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (TrackUser)表服务接口
 *
 * @author makejava
 * @since 2019-08-20 15:16:37
 */

@Service("TrackUserService")
public interface TrackUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TrackUser queryById(Integer id);
    TrackUser queryObj(TrackUser trackUser);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TrackUser> queryAllByLimit(int offset, int limit);

    List<TrackUser> queryAll(TrackUser trackUser);

    /**
     * 新增数据
     *
     * @param trackUser 实例对象
     * @return 实例对象
     */
    TrackUser insert(TrackUser trackUser);

    /**
     * 修改数据
     *
     * @param trackUser 实例对象
     * @return 实例对象
     */
    TrackUser update(TrackUser trackUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    Integer countNum(TrackUser trackUser);
}
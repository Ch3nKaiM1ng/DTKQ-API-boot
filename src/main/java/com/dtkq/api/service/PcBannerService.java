package com.dtkq.api.service;

import com.dtkq.api.entity.PcBanner;
import java.util.List;

/**
 * (PcBanner)表服务接口
 *
 * @author makejava
 * @since 2019-09-19 15:21:53
 */
public interface PcBannerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PcBanner queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PcBanner> queryAllByLimit(int offset, int limit);
    List<PcBanner> queryAll(PcBanner pcBanner);

    /**
     * 新增数据
     *
     * @param pcBanner 实例对象
     * @return 实例对象
     */
    PcBanner insert(PcBanner pcBanner);

    /**
     * 修改数据
     *
     * @param pcBanner 实例对象
     * @return 实例对象
     */
    PcBanner update(PcBanner pcBanner);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
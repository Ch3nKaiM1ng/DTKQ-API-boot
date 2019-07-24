package com.dtkq.api.service;

import com.dtkq.api.entity.SysMsg;
import java.util.List;

/**
 * (SysMsg)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:24:39
 */
public interface SysMsgService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysMsg queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysMsg> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysMsg 实例对象
     * @return 实例对象
     */
    SysMsg insert(SysMsg sysMsg);

    /**
     * 修改数据
     *
     * @param sysMsg 实例对象
     * @return 实例对象
     */
    SysMsg update(SysMsg sysMsg);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
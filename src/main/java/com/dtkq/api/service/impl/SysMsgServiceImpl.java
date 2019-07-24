package com.dtkq.api.service.impl;

import com.dtkq.api.entity.SysMsg;
import com.dtkq.api.dao.SysMsgDao;
import com.dtkq.api.service.SysMsgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysMsg)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:24:39
 */
@Service("sysMsgService")
public class SysMsgServiceImpl implements SysMsgService {
    @Resource
    private SysMsgDao sysMsgDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysMsg queryById(Integer id) {
        return this.sysMsgDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysMsg> queryAllByLimit(int offset, int limit) {
        return this.sysMsgDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysMsg 实例对象
     * @return 实例对象
     */
    @Override
    public SysMsg insert(SysMsg sysMsg) {
        this.sysMsgDao.insert(sysMsg);
        return sysMsg;
    }

    /**
     * 修改数据
     *
     * @param sysMsg 实例对象
     * @return 实例对象
     */
    @Override
    public SysMsg update(SysMsg sysMsg) {
        this.sysMsgDao.update(sysMsg);
        return this.queryById(sysMsg.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysMsgDao.deleteById(id) > 0;
    }
}
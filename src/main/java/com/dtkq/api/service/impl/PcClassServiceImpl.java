package com.dtkq.api.service.impl;

import com.dtkq.api.dao.PcClassDao;
import com.dtkq.api.entity.PcClass;
import com.dtkq.api.service.PcClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PcClass)表服务实现类
 *
 * @author makejava
 * @since 2019-09-19 15:21:29
 */
@Service("pcClassService")
public class PcClassServiceImpl implements PcClassService {
    @Resource
    private PcClassDao pcClassDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PcClass queryById(Integer id) {
        return this.pcClassDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PcClass> queryAllByLimit(int offset, int limit) {
        return this.pcClassDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<PcClass> queryAll(PcClass pcClass) {
        return this.pcClassDao.queryAll(pcClass);
    }

    /**
     * 新增数据
     *
     * @param pcClass 实例对象
     * @return 实例对象
     */
    @Override
    public PcClass insert(PcClass pcClass) {
        this.pcClassDao.insert(pcClass);
        return pcClass;
    }

    /**
     * 修改数据
     *
     * @param pcClass 实例对象
     * @return 实例对象
     */
    @Override
    public PcClass update(PcClass pcClass) {
        this.pcClassDao.update(pcClass);
        return this.queryById(pcClass.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.pcClassDao.deleteById(id) > 0;
    }
}
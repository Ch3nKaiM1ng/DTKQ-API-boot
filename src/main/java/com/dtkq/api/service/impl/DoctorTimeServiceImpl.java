package com.dtkq.api.service.impl;

import com.dtkq.api.entity.DoctorTime;
import com.dtkq.api.dao.DoctorTimeDao;
import com.dtkq.api.service.DoctorTimeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DoctorTime)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:23:53
 */
@Service("doctorTimeService")
public class DoctorTimeServiceImpl implements DoctorTimeService {
    @Resource
    private DoctorTimeDao doctorTimeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DoctorTime queryById(Integer id) {
        return this.doctorTimeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DoctorTime> queryAllByLimit(int offset, int limit) {
        return this.doctorTimeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param doctorTime 实例对象
     * @return 实例对象
     */
    @Override
    public DoctorTime insert(DoctorTime doctorTime) {
        this.doctorTimeDao.insert(doctorTime);
        return doctorTime;
    }

    /**
     * 修改数据
     *
     * @param doctorTime 实例对象
     * @return 实例对象
     */
    @Override
    public DoctorTime update(DoctorTime doctorTime) {
        this.doctorTimeDao.update(doctorTime);
        return this.queryById(doctorTime.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.doctorTimeDao.deleteById(id) > 0;
    }
}
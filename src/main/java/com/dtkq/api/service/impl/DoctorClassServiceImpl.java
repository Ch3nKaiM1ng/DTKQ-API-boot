package com.dtkq.api.service.impl;

import com.dtkq.api.entity.DoctorClass;
import com.dtkq.api.dao.DoctorClassDao;
import com.dtkq.api.service.DoctorClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DoctorClass)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:23:45
 */
@Service("doctorClassService")
public class DoctorClassServiceImpl implements DoctorClassService {
    @Resource
    private DoctorClassDao doctorClassDao;

    /**
     * 通过ID查询单条数据
     *
     * @param classId 主键
     * @return 实例对象
     */
    @Override
    public DoctorClass queryById(Integer classId) {
        return this.doctorClassDao.queryById(classId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DoctorClass> queryAllByLimit(int offset, int limit) {
        return this.doctorClassDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param doctorClass 实例对象
     * @return 实例对象
     */
    @Override
    public DoctorClass insert(DoctorClass doctorClass) {
        this.doctorClassDao.insert(doctorClass);
        return doctorClass;
    }

    /**
     * 修改数据
     *
     * @param doctorClass 实例对象
     * @return 实例对象
     */
    @Override
    public DoctorClass update(DoctorClass doctorClass) {
        this.doctorClassDao.update(doctorClass);
        return this.queryById(doctorClass.getClassId());
    }

    /**
     * 通过主键删除数据
     *
     * @param classId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer classId) {
        return this.doctorClassDao.deleteById(classId) > 0;
    }
}
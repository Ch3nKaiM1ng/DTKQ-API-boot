package com.dtkq.api.service.impl;

import com.dtkq.api.entity.LinkDoctorClass;
import com.dtkq.api.dao.LinkDoctorClassDao;
import com.dtkq.api.service.LinkDoctorClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LinkDoctorClass)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:24:22
 */
@Service("linkDoctorClassService")
public class LinkDoctorClassServiceImpl implements LinkDoctorClassService {
    @Resource
    private LinkDoctorClassDao linkDoctorClassDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LinkDoctorClass queryById(Integer id) {
        return this.linkDoctorClassDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<LinkDoctorClass> queryAllByLimit(int offset, int limit) {
        return this.linkDoctorClassDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param linkDoctorClass 实例对象
     * @return 实例对象
     */
    @Override
    public LinkDoctorClass insert(LinkDoctorClass linkDoctorClass) {
        this.linkDoctorClassDao.insert(linkDoctorClass);
        return linkDoctorClass;
    }

    /**
     * 修改数据
     *
     * @param linkDoctorClass 实例对象
     * @return 实例对象
     */
    @Override
    public LinkDoctorClass update(LinkDoctorClass linkDoctorClass) {
        this.linkDoctorClassDao.update(linkDoctorClass);
        return this.queryById(linkDoctorClass.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.linkDoctorClassDao.deleteById(id) > 0;
    }
}
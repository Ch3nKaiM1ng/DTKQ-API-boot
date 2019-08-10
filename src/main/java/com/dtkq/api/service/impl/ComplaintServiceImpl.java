package com.dtkq.api.service.impl;

import com.dtkq.api.entity.Complaint;
import com.dtkq.api.dao.ComplaintDao;
import com.dtkq.api.service.ComplaintService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Complaint)表服务实现类
 *
 * @author makejava
 * @since 2019-08-09 11:00:53
 */
@Service("complaintService")
public class ComplaintServiceImpl implements ComplaintService {
    @Resource
    private ComplaintDao complaintDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Complaint queryById(Integer id) {
        return this.complaintDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Complaint> queryAllByLimit(int offset, int limit) {
        return this.complaintDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param complaint 实例对象
     * @return 实例对象
     */
    @Override
    public Complaint insert(Complaint complaint) {
        this.complaintDao.insert(complaint);
        return complaint;
    }

    /**
     * 修改数据
     *
     * @param complaint 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Complaint complaint) {
        return  this.complaintDao.update(complaint);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.complaintDao.deleteById(id) > 0;
    }
}
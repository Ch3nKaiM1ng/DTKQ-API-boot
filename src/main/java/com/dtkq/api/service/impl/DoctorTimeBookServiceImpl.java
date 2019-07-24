package com.dtkq.api.service.impl;

import com.dtkq.api.entity.DoctorTimeBook;
import com.dtkq.api.dao.DoctorTimeBookDao;
import com.dtkq.api.service.DoctorTimeBookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DoctorTimeBook)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:24:03
 */
@Service("doctorTimeBookService")
public class DoctorTimeBookServiceImpl implements DoctorTimeBookService {
    @Resource
    private DoctorTimeBookDao doctorTimeBookDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DoctorTimeBook queryById(Integer id) {
        return this.doctorTimeBookDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DoctorTimeBook> queryAllByLimit(int offset, int limit) {
        return this.doctorTimeBookDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param doctorTimeBook 实例对象
     * @return 实例对象
     */
    @Override
    public DoctorTimeBook insert(DoctorTimeBook doctorTimeBook) {
        this.doctorTimeBookDao.insert(doctorTimeBook);
        return doctorTimeBook;
    }

    /**
     * 修改数据
     *
     * @param doctorTimeBook 实例对象
     * @return 实例对象
     */
    @Override
    public DoctorTimeBook update(DoctorTimeBook doctorTimeBook) {
        this.doctorTimeBookDao.update(doctorTimeBook);
        return this.queryById(doctorTimeBook.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.doctorTimeBookDao.deleteById(id) > 0;
    }
}
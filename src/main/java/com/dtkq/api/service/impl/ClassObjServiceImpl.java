package com.dtkq.api.service.impl;

import com.dtkq.api.entity.ClassObj;
import com.dtkq.api.dao.ClassObjDao;
import com.dtkq.api.service.ClassObjService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ClassObj)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:23:20
 */
@Service("classObjService")
public class ClassObjServiceImpl implements ClassObjService {
    @Resource
    private ClassObjDao classObjDao;

    /**
     * 通过ID查询单条数据
     *
     * @param objId 主键
     * @return 实例对象
     */
    @Override
    public ClassObj queryById(Integer objId) {
        return this.classObjDao.queryById(objId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ClassObj> queryAllByLimit(int offset, int limit) {
        return this.classObjDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param classObj 实例对象
     * @return 实例对象
     */
    @Override
    public ClassObj insert(ClassObj classObj) {
        this.classObjDao.insert(classObj);
        return classObj;
    }

    /**
     * 修改数据
     *
     * @param classObj 实例对象
     * @return 实例对象
     */
    @Override
    public ClassObj update(ClassObj classObj) {
        this.classObjDao.update(classObj);
        return this.queryById(classObj.getObjId());
    }

    /**
     * 通过主键删除数据
     *
     * @param objId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer objId) {
        return this.classObjDao.deleteById(objId) > 0;
    }
}
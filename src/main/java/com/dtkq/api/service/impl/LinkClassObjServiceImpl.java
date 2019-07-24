package com.dtkq.api.service.impl;

import com.dtkq.api.entity.LinkClassObj;
import com.dtkq.api.dao.LinkClassObjDao;
import com.dtkq.api.service.LinkClassObjService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LinkClassObj)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:24:12
 */
@Service("linkClassObjService")
public class LinkClassObjServiceImpl implements LinkClassObjService {
    @Resource
    private LinkClassObjDao linkClassObjDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LinkClassObj queryById(Integer id) {
        return this.linkClassObjDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<LinkClassObj> queryAllByLimit(int offset, int limit) {
        return this.linkClassObjDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param linkClassObj 实例对象
     * @return 实例对象
     */
    @Override
    public LinkClassObj insert(LinkClassObj linkClassObj) {
        this.linkClassObjDao.insert(linkClassObj);
        return linkClassObj;
    }

    /**
     * 修改数据
     *
     * @param linkClassObj 实例对象
     * @return 实例对象
     */
    @Override
    public LinkClassObj update(LinkClassObj linkClassObj) {
        this.linkClassObjDao.update(linkClassObj);
        return this.queryById(linkClassObj.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.linkClassObjDao.deleteById(id) > 0;
    }
}
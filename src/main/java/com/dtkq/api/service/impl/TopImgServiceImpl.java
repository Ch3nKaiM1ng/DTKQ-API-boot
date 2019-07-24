package com.dtkq.api.service.impl;

import com.dtkq.api.entity.TopImg;
import com.dtkq.api.dao.TopImgDao;
import com.dtkq.api.service.TopImgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TopImg)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 16:24:57
 */
@Service("topImgService")
public class TopImgServiceImpl implements TopImgService {
    @Resource
    private TopImgDao topImgDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TopImg queryById(Integer id) {
        return this.topImgDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TopImg> queryAllByLimit(int offset, int limit) {
        return this.topImgDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param topImg 实例对象
     * @return 实例对象
     */
    @Override
    public TopImg insert(TopImg topImg) {
        this.topImgDao.insert(topImg);
        return topImg;
    }

    /**
     * 修改数据
     *
     * @param topImg 实例对象
     * @return 实例对象
     */
    @Override
    public TopImg update(TopImg topImg) {
        this.topImgDao.update(topImg);
        return this.queryById(topImg.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.topImgDao.deleteById(id) > 0;
    }
}
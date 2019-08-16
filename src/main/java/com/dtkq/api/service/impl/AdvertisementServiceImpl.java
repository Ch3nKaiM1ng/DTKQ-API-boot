package com.dtkq.api.service.impl;

import com.dtkq.api.entity.Advertisement;
import com.dtkq.api.dao.AdvertisementDao;
import com.dtkq.api.entity.Article;
import com.dtkq.api.service.AdvertisementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Advertisement)表服务实现类
 *
 * @author makejava
 * @since 2019-08-16 14:07:47
 */
@Service("advertisementService")
public class AdvertisementServiceImpl implements AdvertisementService {
    @Resource
    private AdvertisementDao advertisementDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Advertisement queryById(Integer id) {
        return this.advertisementDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Advertisement> queryAllByLimit(int offset, int limit) {
        return this.advertisementDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Advertisement> queryAll(Advertisement advertisement) {
        return this.advertisementDao.queryAll(advertisement);
    }

    /**
     * 新增数据
     *
     * @param advertisement 实例对象
     * @return 实例对象
     */
    @Override
    public Advertisement insert(Advertisement advertisement) {
        this.advertisementDao.insert(advertisement);
        return advertisement;
    }

    /**
     * 修改数据
     *
     * @param advertisement 实例对象
     * @return 实例对象
     */
    @Override
    public Advertisement update(Advertisement advertisement) {
        this.advertisementDao.update(advertisement);
        return this.queryById(advertisement.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.advertisementDao.deleteById(id) > 0;
    }
    @Override
    public boolean addNum(Integer id) {
        return this.advertisementDao.addNum(id) > 0;
    }
    @Override
    public Integer countNum(Advertisement advertisement) {
        return advertisementDao.countNum(advertisement);
    }
}
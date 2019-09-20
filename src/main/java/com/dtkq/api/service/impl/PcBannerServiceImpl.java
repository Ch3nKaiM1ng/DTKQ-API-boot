package com.dtkq.api.service.impl;

import com.dtkq.api.entity.PcBanner;
import com.dtkq.api.dao.PcBannerDao;
import com.dtkq.api.service.PcBannerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PcBanner)表服务实现类
 *
 * @author makejava
 * @since 2019-09-19 15:21:53
 */
@Service("pcBannerService")
public class PcBannerServiceImpl implements PcBannerService {
    @Resource
    private PcBannerDao pcBannerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PcBanner queryById(Integer id) {
        return this.pcBannerDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PcBanner> queryAllByLimit(int offset, int limit) {
        return this.pcBannerDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<PcBanner> queryAll(PcBanner pcBanner) {
        return this.pcBannerDao.queryAll(pcBanner);
    }

    /**
     * 新增数据
     *
     * @param pcBanner 实例对象
     * @return 实例对象
     */
    @Override
    public PcBanner insert(PcBanner pcBanner) {
        this.pcBannerDao.insert(pcBanner);
        return pcBanner;
    }

    /**
     * 修改数据
     *
     * @param pcBanner 实例对象
     * @return 实例对象
     */
    @Override
    public PcBanner update(PcBanner pcBanner) {
        this.pcBannerDao.update(pcBanner);
        return this.queryById(pcBanner.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.pcBannerDao.deleteById(id) > 0;
    }
}
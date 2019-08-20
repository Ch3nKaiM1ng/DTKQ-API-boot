package com.dtkq.api.service.impl;

import com.dtkq.api.entity.Search;
import com.dtkq.api.dao.SearchDao;
import com.dtkq.api.service.SearchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Search)表服务实现类
 *
 * @author makejava
 * @since 2019-08-17 15:35:34
 */
@Service("searchService")
public class SearchServiceImpl implements SearchService {
    @Resource
    private SearchDao searchDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    @Override
    public Search queryById(Integer sId) {
        return this.searchDao.queryById(sId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @param s
     * @return 对象列表
     */
    @Override
    public List<Search> queryAllByLimit(int offset, int limit, String sBlong) {
        return this.searchDao.queryAllByLimit(offset, limit,sBlong);
    }

    /**
     * 新增数据
     *
     * @param search 实例对象
     * @return 实例对象
     */
    @Override
    public Search insert(Search search) {
        this.searchDao.insert(search);
        return search;
    }

    /**
     * 修改数据
     *
     * @param search 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Search search) {

        return  this.searchDao.update(search);
    }

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sId) {
        return this.searchDao.deleteById(sId) > 0;
    }

    @Override
    public int queryCount(String sBlong) {
        return this.searchDao.queryCount(sBlong);
    }
}
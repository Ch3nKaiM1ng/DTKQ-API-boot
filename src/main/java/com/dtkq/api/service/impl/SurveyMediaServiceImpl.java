package com.dtkq.api.service.impl;

import com.dtkq.api.entity.Article;
import com.dtkq.api.entity.SurveyMedia;
import com.dtkq.api.dao.SurveyMediaDao;
import com.dtkq.api.service.SurveyMediaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SurveyMedia)表服务实现类
 *
 * @author makejava
 * @since 2019-09-03 10:18:18
 */
@Service("surveyMediaService")
public class SurveyMediaServiceImpl implements SurveyMediaService {
    @Resource
    private SurveyMediaDao surveyMediaDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SurveyMedia queryById(Integer id) {
        return this.surveyMediaDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SurveyMedia> queryAllByLimit(int offset, int limit) {
        return this.surveyMediaDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param surveyMedia 实例对象
     * @return 实例对象
     */
    @Override
    public SurveyMedia insert(SurveyMedia surveyMedia) {
        this.surveyMediaDao.insert(surveyMedia);
        return surveyMedia;
    }

    /**
     * 修改数据
     *
     * @param surveyMedia 实例对象
     * @return 实例对象
     */
    @Override
    public SurveyMedia update(SurveyMedia surveyMedia) {
        this.surveyMediaDao.update(surveyMedia);
        return this.queryById(surveyMedia.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.surveyMediaDao.deleteById(id) > 0;
    }

    @Override
    public Integer countNum(SurveyMedia surveyMedia) {
        return surveyMediaDao.countNum(surveyMedia);
    }

    @Override
    public List<SurveyMedia> queryAll(SurveyMedia surveyMedia) {
        return this.surveyMediaDao.queryAll(surveyMedia);
    }
}
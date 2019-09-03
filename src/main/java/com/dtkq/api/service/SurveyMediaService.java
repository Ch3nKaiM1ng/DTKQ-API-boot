package com.dtkq.api.service;

import com.dtkq.api.entity.Article;
import com.dtkq.api.entity.SurveyMedia;
import java.util.List;

/**
 * (SurveyMedia)表服务接口
 *
 * @author makejava
 * @since 2019-09-03 10:18:18
 */
public interface SurveyMediaService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SurveyMedia queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SurveyMedia> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param surveyMedia 实例对象
     * @return 实例对象
     */
    SurveyMedia insert(SurveyMedia surveyMedia);

    /**
     * 修改数据
     *
     * @param surveyMedia 实例对象
     * @return 实例对象
     */
    SurveyMedia update(SurveyMedia surveyMedia);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    Integer countNum(SurveyMedia surveyMedia);
    List<SurveyMedia> queryAll(SurveyMedia surveyMedia);
}
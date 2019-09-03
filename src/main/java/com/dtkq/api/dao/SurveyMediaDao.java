package com.dtkq.api.dao;

import com.dtkq.api.entity.Article;
import com.dtkq.api.entity.SurveyMedia;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SurveyMedia)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-03 10:18:18
 */
public interface SurveyMediaDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SurveyMedia queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SurveyMedia> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param surveyMedia 实例对象
     * @return 对象列表
     */
    List<SurveyMedia> queryAll(SurveyMedia surveyMedia);

    /**
     * 新增数据
     *
     * @param surveyMedia 实例对象
     * @return 影响行数
     */
    int insert(SurveyMedia surveyMedia);

    /**
     * 修改数据
     *
     * @param surveyMedia 实例对象
     * @return 影响行数
     */
    int update(SurveyMedia surveyMedia);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
    int countNum(SurveyMedia surveyMedia);

}
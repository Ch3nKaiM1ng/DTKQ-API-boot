package com.dtkq.api.dao;

import com.dtkq.api.entity.DoctorClass;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (DoctorClass)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 16:23:45
 */
public interface DoctorClassDao {

    /**
     * 通过ID查询单条数据
     *
     * @param classId 主键
     * @return 实例对象
     */
    DoctorClass queryById(Integer classId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DoctorClass> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param doctorClass 实例对象
     * @return 对象列表
     */
    List<DoctorClass> queryAll(DoctorClass doctorClass);

    /**
     * 新增数据
     *
     * @param doctorClass 实例对象
     * @return 影响行数
     */
    int insert(DoctorClass doctorClass);

    /**
     * 修改数据
     *
     * @param doctorClass 实例对象
     * @return 影响行数
     */
    int update(DoctorClass doctorClass);

    /**
     * 通过主键删除数据
     *
     * @param classId 主键
     * @return 影响行数
     */
    int deleteById(Integer classId);

}
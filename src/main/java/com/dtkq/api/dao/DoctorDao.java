package com.dtkq.api.dao;

import com.dtkq.api.entity.Doctor;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Doctor)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 16:23:34
 */
public interface DoctorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param doctorId 主键
     * @return 实例对象
     */
    Doctor queryById(Integer doctorId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Doctor> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param doctor 实例对象
     * @return 对象列表
     */
    List<Doctor> queryAll(Doctor doctor);

    /**
     * 新增数据
     *
     * @param doctor 实例对象
     * @return 影响行数
     */
    int insert(Doctor doctor);

    /**
     * 修改数据
     *
     * @param doctor 实例对象
     * @return 影响行数
     */
    int update(Doctor doctor);

    /**
     * 通过主键删除数据
     *
     * @param doctorId 主键
     * @return 影响行数
     */
    int deleteById(Integer doctorId);

}
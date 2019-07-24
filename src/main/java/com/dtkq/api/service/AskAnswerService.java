package com.dtkq.api.service;

import com.dtkq.api.entity.AskAnswer;
import java.util.List;

/**
 * (AskAnswer)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 16:22:08
 */
public interface AskAnswerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AskAnswer queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AskAnswer> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param askAnswer 实例对象
     * @return 实例对象
     */
    AskAnswer insert(AskAnswer askAnswer);

    /**
     * 修改数据
     *
     * @param askAnswer 实例对象
     * @return 实例对象
     */
    AskAnswer update(AskAnswer askAnswer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
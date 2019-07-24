package com.dtkq.api.controller;

import com.dtkq.api.entity.ClassObj;
import com.dtkq.api.service.ClassObjService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ClassObj)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:23:20
 */
@RestController
@RequestMapping("classObj")
public class ClassObjController {
    /**
     * 服务对象
     */
    @Resource
    private ClassObjService classObjService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ClassObj selectOne(Integer id) {
        return this.classObjService.queryById(id);
    }

}
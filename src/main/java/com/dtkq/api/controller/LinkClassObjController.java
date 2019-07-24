package com.dtkq.api.controller;

import com.dtkq.api.entity.LinkClassObj;
import com.dtkq.api.service.LinkClassObjService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (LinkClassObj)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:24:12
 */
@RestController
@RequestMapping("linkClassObj")
public class LinkClassObjController {
    /**
     * 服务对象
     */
    @Resource
    private LinkClassObjService linkClassObjService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public LinkClassObj selectOne(Integer id) {
        return this.linkClassObjService.queryById(id);
    }

}
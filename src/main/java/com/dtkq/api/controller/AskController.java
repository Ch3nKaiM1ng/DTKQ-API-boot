package com.dtkq.api.controller;

import com.dtkq.api.entity.Ask;
import com.dtkq.api.service.AskService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Ask)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:21:56
 */
@RestController
@RequestMapping("ask")
public class AskController {
    /**
     * 服务对象
     */
    @Resource
    private AskService askService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Ask selectOne(Integer id) {
        return this.askService.queryById(id);
    }

}
package com.dtkq.api.controller;

import com.dtkq.api.entity.AskThumbs;
import com.dtkq.api.service.AskThumbsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AskThumbs)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:22:36
 */
@RestController
@RequestMapping("askThumbs")
public class AskThumbsController {
    /**
     * 服务对象
     */
    @Resource
    private AskThumbsService askThumbsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AskThumbs selectOne(Integer id) {
        return this.askThumbsService.queryById(id);
    }

}
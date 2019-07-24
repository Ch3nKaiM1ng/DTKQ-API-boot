package com.dtkq.api.controller;

import com.dtkq.api.entity.AskComment;
import com.dtkq.api.service.AskCommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AskComment)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:22:22
 */
@RestController
@RequestMapping("askComment")
public class AskCommentController {
    /**
     * 服务对象
     */
    @Resource
    private AskCommentService askCommentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AskComment selectOne(Integer id) {
        return this.askCommentService.queryById(id);
    }

}
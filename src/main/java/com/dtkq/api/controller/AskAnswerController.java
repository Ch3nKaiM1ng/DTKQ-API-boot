package com.dtkq.api.controller;

import com.dtkq.api.entity.AskAnswer;
import com.dtkq.api.service.AskAnswerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AskAnswer)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:22:08
 */
@RestController
@RequestMapping("askAnswer")
public class AskAnswerController {
    /**
     * 服务对象
     */
    @Resource
    private AskAnswerService askAnswerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AskAnswer selectOne(Integer id) {
        return this.askAnswerService.queryById(id);
    }

}
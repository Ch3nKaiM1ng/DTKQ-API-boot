package com.dtkq.api.controller;

import com.dtkq.api.entity.TalkClass;
import com.dtkq.api.service.TalkClassService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TalkClass)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:24:49
 */
@RestController
@RequestMapping("talkClass")
public class TalkClassController {
    /**
     * 服务对象
     */
    @Resource
    private TalkClassService talkClassService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TalkClass selectOne(Integer id) {
        return this.talkClassService.queryById(id);
    }

}
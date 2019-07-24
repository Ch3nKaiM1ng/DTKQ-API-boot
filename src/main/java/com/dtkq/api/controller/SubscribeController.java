package com.dtkq.api.controller;

import com.dtkq.api.entity.Subscribe;
import com.dtkq.api.service.SubscribeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Subscribe)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:24:30
 */
@RestController
@RequestMapping("subscribe")
public class SubscribeController {
    /**
     * 服务对象
     */
    @Resource
    private SubscribeService subscribeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Subscribe selectOne(Integer id) {
        return this.subscribeService.queryById(id);
    }

}
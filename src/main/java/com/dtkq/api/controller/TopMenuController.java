package com.dtkq.api.controller;

import com.dtkq.api.entity.TopMenu;
import com.dtkq.api.service.TopMenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TopMenu)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:25:06
 */
@RestController
@RequestMapping("topMenu")
public class TopMenuController {
    /**
     * 服务对象
     */
    @Resource
    private TopMenuService topMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TopMenu selectOne(Integer id) {
        return this.topMenuService.queryById(id);
    }

}
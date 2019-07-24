package com.dtkq.api.controller;

import com.dtkq.api.entity.BackMenu;
import com.dtkq.api.service.BackMenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (BackMenu)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:22:50
 */
@RestController
@RequestMapping("backMenu")
public class BackMenuController {
    /**
     * 服务对象
     */
    @Resource
    private BackMenuService backMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BackMenu selectOne(Integer id) {
        return this.backMenuService.queryById(id);
    }

}
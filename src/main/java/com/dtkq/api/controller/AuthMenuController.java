package com.dtkq.api.controller;

import com.dtkq.api.entity.AuthMenu;
import com.dtkq.api.service.AuthMenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AuthMenu)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:22:41
 */
@RestController
@RequestMapping("authMenu")
public class AuthMenuController {
    /**
     * 服务对象
     */
    @Resource
    private AuthMenuService authMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AuthMenu selectOne(Integer id) {
        return this.authMenuService.queryById(id);
    }

}
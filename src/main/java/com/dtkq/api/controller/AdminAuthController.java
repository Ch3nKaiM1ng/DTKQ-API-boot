package com.dtkq.api.controller;

import com.dtkq.api.entity.AdminAuth;
import com.dtkq.api.service.AdminAuthService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AdminAuth)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:21:18
 */
@RestController
@RequestMapping("adminAuth")
public class AdminAuthController {

    /**
     * 服务对象
     */
    @Resource
    private AdminAuthService adminAuthService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AdminAuth selectOne(Integer id) {
        return this.adminAuthService.queryById(id);
    }

}
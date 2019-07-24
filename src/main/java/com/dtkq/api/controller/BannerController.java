package com.dtkq.api.controller;

import com.dtkq.api.entity.Banner;
import com.dtkq.api.service.BannerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Banner)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:23:00
 */
@RestController
@RequestMapping("banner")
public class BannerController {
    /**
     * 服务对象
     */
    @Resource
    private BannerService bannerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Banner selectOne(Integer id) {
        return this.bannerService.queryById(id);
    }

}
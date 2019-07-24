package com.dtkq.api.controller;

import com.dtkq.api.entity.TopImg;
import com.dtkq.api.service.TopImgService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TopImg)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:24:57
 */
@RestController
@RequestMapping("topImg")
public class TopImgController {
    /**
     * 服务对象
     */
    @Resource
    private TopImgService topImgService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TopImg selectOne(Integer id) {
        return this.topImgService.queryById(id);
    }

}
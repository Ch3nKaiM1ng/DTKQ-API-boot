package com.dtkq.api.controller;

import com.dtkq.api.entity.ArticleThumbs;
import com.dtkq.api.service.ArticleThumbsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ArticleThumbs)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:21:50
 */
@RestController
@RequestMapping("articleThumbs")
public class ArticleThumbsController {
    /**
     * 服务对象
     */
    @Resource
    private ArticleThumbsService articleThumbsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ArticleThumbs selectOne(Integer id) {
        return this.articleThumbsService.queryById(id);
    }

}
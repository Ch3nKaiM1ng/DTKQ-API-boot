package com.dtkq.api.controller;

import com.dtkq.api.entity.ArticleComment;
import com.dtkq.api.service.ArticleCommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ArticleComment)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:21:37
 */
@RestController
@RequestMapping("articleComment")
public class ArticleCommentController {
    /**
     * 服务对象
     */
    @Resource
    private ArticleCommentService articleCommentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ArticleComment selectOne(Integer id) {
        return this.articleCommentService.queryById(id);
    }

}
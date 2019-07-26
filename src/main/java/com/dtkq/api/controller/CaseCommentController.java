package com.dtkq.api.controller;

import com.dtkq.api.entity.CaseComment;
import com.dtkq.api.service.CaseCommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (CaseComment)表控制层
 *
 * @author makejava
 * @since 2019-07-26 17:39:28
 */
@RestController
@RequestMapping("caseComment")
public class CaseCommentController {
    /**
     * 服务对象
     */
    @Resource
    private CaseCommentService caseCommentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CaseComment selectOne(Integer id) {
        return this.caseCommentService.queryById(id);
    }

}
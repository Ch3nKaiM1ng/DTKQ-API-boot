package com.dtkq.api.controller;

import com.dtkq.api.entity.Case;
import com.dtkq.api.service.CaseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Case)表控制层
 *
 * @author makejava
 * @since 2019-07-26 17:38:48
 */
@RestController
@RequestMapping("case")
public class CaseController {
    /**
     * 服务对象
     */
    @Resource
    private CaseService caseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Case selectOne(Integer id) {
        return this.caseService.queryById(id);
    }

}
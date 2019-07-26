package com.dtkq.api.controller;

import com.dtkq.api.entity.CaseDetail;
import com.dtkq.api.service.CaseDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (CaseDetail)表控制层
 *
 * @author makejava
 * @since 2019-07-26 17:39:28
 */
@RestController
@RequestMapping("caseDetail")
public class CaseDetailController {
    /**
     * 服务对象
     */
    @Resource
    private CaseDetailService caseDetailService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CaseDetail selectOne(Integer id) {
        return this.caseDetailService.queryById(id);
    }

}
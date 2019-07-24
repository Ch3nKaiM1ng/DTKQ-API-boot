package com.dtkq.api.controller;

import com.dtkq.api.entity.SysMsg;
import com.dtkq.api.service.SysMsgService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysMsg)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:24:39
 */
@RestController
@RequestMapping("sysMsg")
public class SysMsgController {
    /**
     * 服务对象
     */
    @Resource
    private SysMsgService sysMsgService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysMsg selectOne(Integer id) {
        return this.sysMsgService.queryById(id);
    }

}
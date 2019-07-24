package com.dtkq.api.controller;

import com.dtkq.api.entity.UserTalkRead;
import com.dtkq.api.service.UserTalkReadService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UserTalkRead)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:25:33
 */
@RestController
@RequestMapping("userTalkRead")
public class UserTalkReadController {
    /**
     * 服务对象
     */
    @Resource
    private UserTalkReadService userTalkReadService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserTalkRead selectOne(Integer id) {
        return this.userTalkReadService.queryById(id);
    }

}
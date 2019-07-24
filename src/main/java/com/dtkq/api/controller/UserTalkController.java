package com.dtkq.api.controller;

import com.dtkq.api.entity.UserTalk;
import com.dtkq.api.service.UserTalkService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UserTalk)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:25:25
 */
@RestController
@RequestMapping("userTalk")
public class UserTalkController {
    /**
     * 服务对象
     */
    @Resource
    private UserTalkService userTalkService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserTalk selectOne(Integer id) {
        return this.userTalkService.queryById(id);
    }

}
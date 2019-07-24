package com.dtkq.api.controller;

import com.dtkq.api.entity.LinkDoctorClass;
import com.dtkq.api.service.LinkDoctorClassService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (LinkDoctorClass)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:24:22
 */
@RestController
@RequestMapping("linkDoctorClass")
public class LinkDoctorClassController {
    /**
     * 服务对象
     */
    @Resource
    private LinkDoctorClassService linkDoctorClassService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public LinkDoctorClass selectOne(Integer id) {
        return this.linkDoctorClassService.queryById(id);
    }

}
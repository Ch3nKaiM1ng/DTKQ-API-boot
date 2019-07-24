package com.dtkq.api.controller;

import com.dtkq.api.entity.DoctorClass;
import com.dtkq.api.service.DoctorClassService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DoctorClass)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:23:45
 */
@RestController
@RequestMapping("doctorClass")
public class DoctorClassController {
    /**
     * 服务对象
     */
    @Resource
    private DoctorClassService doctorClassService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DoctorClass selectOne(Integer id) {
        return this.doctorClassService.queryById(id);
    }

}
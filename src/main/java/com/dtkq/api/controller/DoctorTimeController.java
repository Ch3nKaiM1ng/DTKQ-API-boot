package com.dtkq.api.controller;

import com.dtkq.api.entity.DoctorTime;
import com.dtkq.api.service.DoctorTimeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DoctorTime)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:23:53
 */
@RestController
@RequestMapping("doctorTime")
public class DoctorTimeController {
    /**
     * 服务对象
     */
    @Resource
    private DoctorTimeService doctorTimeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DoctorTime selectOne(Integer id) {
        return this.doctorTimeService.queryById(id);
    }

}
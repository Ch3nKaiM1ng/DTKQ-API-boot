package com.dtkq.api.controller;

import com.dtkq.api.entity.Doctor;
import com.dtkq.api.service.DoctorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Doctor)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:23:34
 */
@RestController
@RequestMapping("doctor")
public class DoctorController {
    /**
     * 服务对象
     */
    @Resource
    private DoctorService doctorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Doctor selectOne(Integer id) {
        return this.doctorService.queryById(id);
    }

}
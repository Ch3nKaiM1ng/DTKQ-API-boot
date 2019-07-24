package com.dtkq.api.controller;

import com.dtkq.api.entity.DoctorTimeBook;
import com.dtkq.api.service.DoctorTimeBookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DoctorTimeBook)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:24:03
 */
@RestController
@RequestMapping("doctorTimeBook")
public class DoctorTimeBookController {
    /**
     * 服务对象
     */
    @Resource
    private DoctorTimeBookService doctorTimeBookService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DoctorTimeBook selectOne(Integer id) {
        return this.doctorTimeBookService.queryById(id);
    }

}
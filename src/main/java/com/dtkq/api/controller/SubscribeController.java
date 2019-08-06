package com.dtkq.api.controller;

import com.dtkq.api.entity.Subscribe;
import com.dtkq.api.service.SubscribeService;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * (Subscribe)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:24:30
 */
@RestController
@RequestMapping("/subscribe")
public class SubscribeController {
    /**
     * 服务对象
     */
    @Resource
    private SubscribeService subscribeService;

    /**
     * 返回
     */
    private ReturnDiscern re = new ReturnDiscern();


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Subscribe selectOne(Integer id) {
        return this.subscribeService.queryById(id);
    }

    /**
     * 插入
     */
    @RequestMapping("/inset")
    public Map<String,Object> inset(@RequestBody Subscribe subscribe){
        if (subscribe!=null){
            Subscribe count = this.subscribeService.insert(subscribe);
            if (count!=null){
                return re.SUCCESSOBJ(subscribe);
            }
            return re.ERRORMSG("inset error!");
        }
        return re.ERRORMSG("pass in a null value!");
    }

}
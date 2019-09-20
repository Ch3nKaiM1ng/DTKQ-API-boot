package com.dtkq.api.controller;

import com.dtkq.api.entity.PcBanner;
import com.dtkq.api.entity.PcClass;
import com.dtkq.api.service.PcBannerService;
import com.dtkq.api.utils.DateUtils;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (PcBanner)表控制层
 *
 * @author makejava
 * @since 2019-09-19 15:21:53
 */
@RestController
@RequestMapping("pcBanner")
public class PcBannerController {
    /**
     * 服务对象
     */
    @Resource
    private PcBannerService service;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PcBanner selectOne(Integer id) {
        return this.service.queryById(id);
    }
    //    时间utils
    private DateUtils data = new DateUtils();
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();
    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll(@RequestBody PcBanner entity) {

        List<PcBanner> list =service.queryAll(entity);
        return re.SUCCESSOBJ(list);
    }
    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody PcBanner entity) {
        service.insert(entity);

        return re.SUCCESS();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody PcBanner entity) {
        if (entity.getId() != null) {
            service.update(entity);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
    }
    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody PcBanner entity) {
        if (entity.getId() != null) {
            service.deleteById(entity.getId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody PcBanner entity) {
        if (entity.getId() != null) {
            PcBanner obj=service.queryById(entity.getId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
}
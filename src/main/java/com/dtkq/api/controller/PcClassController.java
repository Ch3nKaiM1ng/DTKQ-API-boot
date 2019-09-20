package com.dtkq.api.controller;

import com.dtkq.api.entity.PcClass;
import com.dtkq.api.entity.TalkClass;
import com.dtkq.api.service.PcClassService;
import com.dtkq.api.utils.DateUtils;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * (PcClass)表控制层
 *
 * @author makejava
 * @since 2019-09-19 15:21:29
 */
@RestController
@RequestMapping("pcClass")
public class PcClassController {
    /**
     * 服务对象
     */
    @Resource
    private PcClassService service;
    //    时间utils
    private DateUtils data = new DateUtils();
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PcClass selectOne(Integer id) {
        return this.service.queryById(id);
    }

    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll(@RequestBody PcClass entity) {

        List<PcClass> list = service.queryAll(entity);
        return re.SUCCESSOBJ(list);
    }

    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody PcClass entity) {
        service.insert(entity);

        return re.SUCCESS();
    }

    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody PcClass entity) {
        if (entity.getId() != null) {
            service.update(entity);
            return re.SUCCESS();
        } else {
            return re.ERRORMSG("缺少参数ID");
        }
    }

    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody PcClass entity) {
        if (entity.getId() != null) {
            service.deleteById(entity.getId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }

    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody PcClass entity) {
        if (entity.getId() != null) {
            PcClass obj = service.queryById(entity.getId());
            if (obj != null) {
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }

}
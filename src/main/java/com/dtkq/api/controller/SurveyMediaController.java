package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.Article;
import com.dtkq.api.entity.SurveyMedia;
import com.dtkq.api.service.SurveyMediaService;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (SurveyMedia)表控制层
 *
 * @author makejava
 * @since 2019-09-03 10:18:18
 */
@RestController
@RequestMapping("surveyMedia")
public class SurveyMediaController {
    /**
     * 服务对象
     */
    @Resource
    private SurveyMediaService service;
    private ReturnDiscern re = new ReturnDiscern();

    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll(@RequestBody SurveyMedia entity) {
        int currpage=entity.getOffset();//offset 查询起始位置
        int limit=entity.getLimit();//limit 查询条数
        if(currpage==1){
            entity.setOffset(currpage-1);
        }else if(currpage>1){
            entity.setOffset((currpage-1)*limit);
        }
        Integer countNum=service.countNum(entity);//查到所有数据数
        JSONObject jsonObject=new JSONObject();//组成一个对象
        List<SurveyMedia> list =service.queryAll(entity);
        jsonObject.put("limit",limit);//返回当前页显示条数
        jsonObject.put("currpage",currpage);//返回当前页
        jsonObject.put("countNum",countNum);//返回当前页
        jsonObject.put("dataList",list);//返回当前数组
        return re.SUCCESSOBJ(jsonObject);
    }
    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody SurveyMedia entity) {
        service.insert(entity);
        if (entity.getId() != null) {
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody SurveyMedia entity) {
        if (entity.getId() != null) {
            service.update(entity);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
    }

    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody SurveyMedia entity) {
        if (entity.getId() != null) {
            service.deleteById(entity.getId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody SurveyMedia entity) {
        if (entity.getId() != null) {
            SurveyMedia obj=service.queryById(entity.getId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
}
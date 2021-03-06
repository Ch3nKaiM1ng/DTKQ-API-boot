package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.ArticleComment;
import com.dtkq.api.entity.CaseComment;
import com.dtkq.api.service.CaseCommentService;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (CaseComment)表控制层
 *
 * @author makejava
 * @since 2019-07-26 17:39:28
 */
@RestController
@RequestMapping("caseComment")
public class CaseCommentController {
    /**
     * 服务对象
     */
    @Resource
    private CaseCommentService service;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CaseComment selectOne(Integer id) {
        return this.service.queryById(id);
    }
    private ReturnDiscern re = new ReturnDiscern();

    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll(@RequestBody CaseComment entity) {
        int currpage=entity.getOffset();
        int limit=entity.getLimit();
        if(currpage==1){
            entity.setOffset(currpage-1);
        }else if(currpage>1){
            entity.setOffset((currpage-1)*limit);
        }
        Integer countNum=service.countNum(entity);//查到所有数据数
        List<CaseComment> list =service.queryAll(entity);
        for(CaseComment x:list){
            System.out.println(x.getId());
        }
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("limit",limit);
        jsonObject.put("countNum",countNum);
        jsonObject.put("currpage",currpage);
        jsonObject.put("dataList",list);
        return re.SUCCESSOBJ(jsonObject);
    }
    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody CaseComment entity) {
        service.insert(entity);
        if (entity.getId() != null) {
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody CaseComment entity) {
        if (entity.getId() != null) {
            service.update(entity);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
    }

    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody CaseComment entity) {
        if (entity.getId() != null) {
            service.deleteById(entity.getId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody CaseComment entity) {
        if (entity.getId() != null) {
            CaseComment obj=service.queryById(entity.getId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findSonList")
    public Map<String, Object> findSonList(@RequestBody CaseComment entity) {
        if (entity.getCaseId() != null) {
            List<CaseComment> obj=service.findAllData(entity);
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
    //  点赞
    @RequestMapping("/DoThumb")
    public Map<String, Object> DoThumb(@RequestBody CaseComment entity) {
        if (entity.getId() != null) {
            entity.setThumbNum(1);//点赞量++
            boolean rs=service.addNum(entity); //引用DAO 层开始操作数据库
            //增加浏览量 --结束
            if(rs==true){
                return re.SUCCESSOBJ(rs);
            }

        }
        return re.ERROR();
    }
}
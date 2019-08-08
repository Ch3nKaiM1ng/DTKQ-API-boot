package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.Ask;
import com.dtkq.api.entity.Case;
import com.dtkq.api.service.CaseService;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Case)表控制层
 *
 * @author makejava
 * @since 2019-07-26 17:38:48
 */
@RestController
@RequestMapping("case")
public class CaseController {
    /**
     * 服务对象
     */
    @Resource
    private CaseService service;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Case selectOne(Integer id) {
        return this.service.queryById(id);
    }
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();

    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll(@RequestBody Case entity) {
        int currpage=entity.getOffset();//offset 查询起始位置
        int limit=entity.getLimit();//limit 查询条数
        if(currpage==1){
            entity.setOffset(currpage-1);
        }else if(currpage>1){
            entity.setOffset((currpage-1)*limit);
        }

        List<Case> list =service.queryAll(entity);
        Integer countNum =service.countNum(entity);
        /*List<ArticleComment> list =service.queryAllByLimit(entity);*/
        JSONObject jsonObject=new JSONObject();//组成一个对象
        jsonObject.put("limit",limit);//返回当前页显示条数
        jsonObject.put("currpage",currpage);//返回当前页
        jsonObject.put("countNum",countNum);//总数据
        jsonObject.put("dataList",list);//返回当前数组
        return re.SUCCESSOBJ(jsonObject);
    }

    //  查找所有
    @RequestMapping("/queryByfunction")
    public Map<String, Object> queryByfunction(@RequestBody Case entity) {
        int currpage=entity.getOffset();//offset 查询起始位置
        int limit=entity.getLimit();//limit 查询条数
        if(currpage==1){
            entity.setOffset(currpage-1);
        }else if(currpage>1){
            entity.setOffset((currpage-1)*limit);
        }

        List<Case> list =service.queryByfunction(entity);
        Integer countNum =service.countFunction(entity);
        /*List<ArticleComment> list =service.queryAllByLimit(entity);*/
        JSONObject jsonObject=new JSONObject();//组成一个对象
        jsonObject.put("limit",limit);//返回当前页显示条数
        jsonObject.put("currpage",currpage);//返回当前页
        jsonObject.put("countNum",countNum);//总数据
        jsonObject.put("dataList",list);//返回当前数组
        return re.SUCCESSOBJ(jsonObject);
    }

    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody Case entity) {
        service.insert(entity);
        if (entity.getId() != null) {
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody Case entity) {
        if (entity.getId() != null) {
            service.update(entity);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
    }

    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody Case entity) {
        if (entity.getId() != null) {
            service.deleteById(entity.getId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody Case entity) {
        if (entity.getId() != null) {
            Case obj=service.queryById(entity.getId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }

    //  前台查看单个文章并且增加浏览量
    @RequestMapping("/webFindObj")
    public Map<String, Object> webFindObj(@RequestBody Case entity) {
        if (entity.getId() != null) {
            //增加浏览量
            Case addNumP=new Case();
            addNumP.setId(entity.getId()); //设置需要增加的问答
            addNumP.setCaseChecknum(1);//1则代表需要增加浏览量
            Case obj=service.addNum(addNumP); //引用DAO 层开始操作数据库
            //增加浏览量 --结束
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
    //  点赞文章
    @RequestMapping("/caseDoThumb")
    public Map<String, Object> caseDoThumb(@RequestBody Case entity) {
        if (entity.getId() != null) {
            entity.setCaseThumbnum(1);//点赞量++
            Case obj=service.addNum(entity); //引用DAO 层开始操作数据库
            //增加浏览量 --结束
            return re.SUCCESSOBJ(obj);
        }
        return re.ERROR();
    }
}
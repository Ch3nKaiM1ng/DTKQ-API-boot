package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.Article;
import com.dtkq.api.entity.Ask;
import com.dtkq.api.entity.TopMenu;
import com.dtkq.api.service.ArticleService;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * (Article)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:21:24
 */
@RestController
@RequestMapping("article")
public class ArticleController {
    /**
     * 服务对象
     */
    @Resource
    private ArticleService service;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();

    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll(@RequestBody Article entity) {
        int currpage=entity.getOffset();//offset 查询起始位置
        int limit=entity.getLimit();//limit 查询条数
        entity.setOffset(currpage-1);
        JSONObject jsonObject=new JSONObject();//组成一个对象
        List<Article> list =service.queryAll(entity);
        jsonObject.put("limit",limit);//返回当前页显示条数
        jsonObject.put("currpage",currpage);//返回当前页
        jsonObject.put("dataList",list);//返回当前数组
        return re.SUCCESSOBJ(jsonObject);
    }
    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody Article entity) {
            service.insert(entity);
            if (entity.getArtId() != null) {
                return re.SUCCESS();
            }
        return re.ERROR();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody Article entity) {
        if (entity.getArtId() != null) {
            service.update(entity);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
    }

    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody Article entity) {
        if (entity.getArtId() != null) {
            service.deleteById(entity.getArtId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody Article entity) {
        if (entity.getArtId() != null) {
            Article obj=service.queryById(entity.getArtId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }

    //  前台查看单个文章并且增加浏览量
    @RequestMapping("/webFindObj")
    public Map<String, Object> webFindObj(@RequestBody Article entity) {
        if (entity.getArtId() != null) {
            //增加浏览量
            Article addNumP=new Article();
            addNumP.setArtId(entity.getArtId()); //设置需要增加的文章ID
            addNumP.setCheckNum(1);//1则代表需要增加浏览量
            Article obj=service.addNum(addNumP); //引用DAO 层开始操作数据库
            //增加浏览量 --结束
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
    //  点赞文章
    @RequestMapping("/artDoThumb")
    public Map<String, Object> artDoThumb(@RequestBody Article entity) {
        if (entity.getArtId() != null) {
            entity.setThumbNum(1);//点赞量++
            Article obj=service.addNum(entity); //引用DAO 层开始操作数据库
            //增加浏览量 --结束
            return re.SUCCESSOBJ(obj);
        }
        return re.ERROR();
    }
}
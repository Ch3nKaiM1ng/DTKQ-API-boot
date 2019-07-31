package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.Article;
import com.dtkq.api.entity.Ask;
import com.dtkq.api.entity.Doctor;
import com.dtkq.api.entity.TopMenu;
import com.dtkq.api.service.ArticleService;
import com.dtkq.api.service.AskService;
import com.dtkq.api.service.DoctorService;
import com.dtkq.api.utils.ReturnDiscern;
import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
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
    @Resource
    private AskService askService;
    @Resource
    private DoctorService doctorService;

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

    //  点赞文章
    @RequestMapping("/webPageBlockList")
    public Map<String, Object> webPageBlockList(@RequestBody JSONObject jsonObject) {
        /*int currpage=jsonObject.getInteger("offset");//offset 查询起始位置
        int limit=jsonObject.getInteger("limit");//limit 查询条数
        articleList(jsonObject);
        askList(jsonObject);
        doctorList(jsonObject);*/
        JSONObject data=pageList(jsonObject);
        if(data!=null){
            return re.SUCCESSOBJ(data);
        }
        return re.ERROR();
    }
    private JSONObject articleList(JSONObject jsonObject){
        int currpage=jsonObject.getInteger("offset");//offset 查询起始位置
        int limit=3;//limit 查询条数\
        Article entity=new Article();
        Integer countNum=service.countNum(entity);//查到所有数据数
        Integer allPage=countNum/3;

        entity.setOffset(currpage-1);
        entity.setLimit(limit);
        List<Article> list =service.queryAll(entity);
        JSONObject js=new JSONObject();
        js.put("countNum",countNum);
        js.put("allPage",allPage);
        js.put("objList",list);
        return js;
    }
    private JSONObject askList(JSONObject jsonObject){
        int currpage=jsonObject.getInteger("offset");//offset 查询起始位置
        int limit=2;//limit 查询条数\
        Ask entity=new Ask();
        Integer countNum=askService.countNum(entity);//查到所有数据数
        Integer allPage=countNum/2;

        List<Ask> list =askService.queryAllByLimit(currpage-1,limit);
        JSONObject js=new JSONObject();
        js.put("countNum",countNum);
        js.put("allPage",allPage);
        js.put("objList",list);
        return js;
    }
    private JSONObject doctorList(JSONObject jsonObject){
        int currpage=jsonObject.getInteger("offset");//offset 查询起始位置
        int limit=1;//limit 查询条数\
        Doctor entity=new Doctor();
        Integer countNum=doctorService.countNum(entity);//查到所有数据数
        Integer allPage=countNum;

        List<Doctor> list =doctorService.selectAllByLimit(currpage-1,limit);
        JSONObject js=new JSONObject();
        js.put("countNum",countNum);
        js.put("allPage",allPage);
        js.put("objList",list);
        return js;
    }
    private JSONObject pageList(JSONObject jsonObject){
        int currpage=jsonObject.getInteger("offset");
        JSONObject artObj=articleList(jsonObject);
        JSONObject askObj=askList(jsonObject);
        JSONObject doctorObj=doctorList(jsonObject);
        //算出总共可以有几页可以显示出来
        Integer artPage=artObj.getInteger("allPage");
        Integer askPage=askObj.getInteger("allPage");
        Integer doctorPage=doctorObj.getInteger("allPage");
        Integer showPage=1;
            if(artPage<askPage){
                showPage=artPage;
            }else{
                showPage=askPage;
            }
            if(showPage>doctorPage){
                showPage=doctorPage;
            }

        JSONObject reObj=new JSONObject();
        /*jsonArray.add(artObj.get("objList"));
        jsonArray.add(askObj.get("objList"));
        jsonArray.add(doctorObj.get("objList"));*/
        JSONArray jsonArray=putJson(artObj,askObj,doctorObj);
        reObj.put("showPage",showPage);
        reObj.put("currpage",currpage);
        reObj.put("dataList",jsonArray);
         return  reObj;
    }
    private JSONArray putJson(JSONObject artObject,JSONObject askObj,JSONObject doctorObj){

        JSONArray jsonArray=new JSONArray();
        List artlist=(List)  artObject.get("objList");
        List asklist=(List)  askObj.get("objList");
        List doctorlist=(List)  doctorObj.get("objList");
        jsonArray.add(artlist.get(0));
        jsonArray.add(asklist.get(0));
        jsonArray.add(artlist.get(1));
        jsonArray.add(asklist.get(1));
        jsonArray.add(doctorlist.get(0));
        jsonArray.add(artlist.get(2));
        /*if(style==1){
            json.put("artList",jsonObject.get("objList"));
        }else if(style==2){
            json.put("askList",jsonObject.get("objList"));
        }else if(style==3){
            json.put("doctorList",jsonObject.get("objList"));
        }*/
        return jsonArray;
    }
}
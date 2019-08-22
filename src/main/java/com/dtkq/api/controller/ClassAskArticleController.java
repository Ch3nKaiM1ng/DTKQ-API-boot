package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.ClassAskArticle;
import com.dtkq.api.service.ClassAskArticleService;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * (ClassAskArticle)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:23:11
 */
@RestController
@RequestMapping("/classAskArticle")
public class ClassAskArticleController {
    /**
     * 服务对象
     */
    @Resource
    private ClassAskArticleService classAskArticleService;

    //引用return
    private ReturnDiscern re = new ReturnDiscern();
    @Autowired
    HttpServletRequest request;

    HttpServletResponse response;
    @RequestMapping("/selectOne")
    public Map<String,Object>selectOne(Integer acId){
        return re.SUCCESSOBJ(this.classAskArticleService.queryById(acId));
    }

    /**
     * 查询热搜榜
     */
    @RequestMapping("/selectHot")
    public Map<String,Object> selectHot(@RequestBody ClassAskArticle askArticle){
        if (askArticle.getBelong()==null){
            return re.ERRORMSG("pass in a null value!");
        }else {
            //用户保存日志
            if(askArticle.getBelong().equals("1")){
                JSONObject json =new JSONObject();
                json.put("action","用户进入首页获取数据");
                re.getIpAndMobileMsg(request,response,json);
            }
            if(askArticle.getBelong().equals("61")){
                JSONObject json =new JSONObject();
                json.put("action","用户进入矫正热搜榜查看列表");
                re.getIpAndMobileMsg(request,response,json);
            }
            if(askArticle.getBelong().equals("62")){
                JSONObject json =new JSONObject();
                json.put("action","用户进入修复热搜榜获取数据");
                re.getIpAndMobileMsg(request,response,json);
            }
            if(askArticle.getBelong().equals("63")){
                JSONObject json =new JSONObject();
                json.put("action","用户进入种植热搜榜获取数据");
                re.getIpAndMobileMsg(request,response,json);
            }
            //用户保存日志
            List<ClassAskArticle> askArticleList = this.classAskArticleService.queryAll(askArticle);
            for (int i =0 ;i<askArticleList.size();i++){
                if (askArticleList.get(i).getAsk()==null&&askArticleList.get(i).getArticle()==null) {
                    askArticleList.remove(i);
                    continue;
                }


                if (askArticleList.get(i).getAsk()!=null||askArticleList.get(i).getArticle()!=null) {
                    if (askArticleList.get(i).getAc_artId() != null) {
                        askArticleList.get(i).getArticle().setArtCommentNum(123);
                        askArticleList.get(i).setManNum(234);
                        askArticleList.get(i).setWomanNum(234);
                    } else {
                        askArticleList.get(i).getAsk().setAskCommentNum(123);
                        askArticleList.get(i).setManNum(234);
                        askArticleList.get(i).setWomanNum(234);
                    }
                }
            }
            return re.SUCCESSOBJ(askArticleList);
        }
    }

//    插入
    @RequestMapping("/inset")
    public Map<String,Object> insetHot(@RequestBody ClassAskArticle askArticle){
        if (askArticle.getAc_askId()!=null||askArticle.getAc_artId()!=null){
            ClassAskArticle count = this.classAskArticleService.insert(askArticle);
            if (count.getAcId()!=null){
                return re.SUCCESS();
            }
            return re.ERRORMSG("inset error!");
        }
        return re.ERRORMSG("pass in a null value!");
    }

//    修改
    @RequestMapping("/update")
    public Map<String,Object> updateClassAskArticle(@RequestBody ClassAskArticle askArticle){
        if (askArticle.getAcId()!=null){
            int count = this.classAskArticleService.update(askArticle);
            if (count>0){
                return re.SUCCESS();
            }
            return re.ERROR();
        }
        return re.SUCCESSOBJ("pass in a null value!");
    }

//    查询
    @RequestMapping("/selectById")
    public Map<String,Object>selectById(@RequestBody ClassAskArticle askArticle){
        if (askArticle.getAcId()!=null){
            ClassAskArticle classAskArticle = this.classAskArticleService.queryById(askArticle.getAcId());
            if (classAskArticle!=null){
                return re.SUCCESSOBJ(classAskArticle);
            }
            return re.ERRORMSG("not countent fount!");
        }
        return re.ERRORMSG("pass in a null value!");
    }

}
package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.Article;
import com.dtkq.api.entity.ArticleComment;
import com.dtkq.api.entity.AskAnswer;
import com.dtkq.api.service.ArticleCommentService;
import com.dtkq.api.service.ArticleService;
import com.dtkq.api.utils.ReturnDiscern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * (ArticleCommentComment)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:21:37
 */
@RestController
@RequestMapping("articleComment")
public class ArticleCommentController {
    /**
     * 服务对象
     */
    @Resource
    private ArticleCommentService service;
    @Resource
    private ArticleService articleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();

    private static Logger log= LoggerFactory.getLogger(ArticleCommentController.class);
    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll(@RequestBody ArticleComment entity) {
        int currpage=entity.getOffset();
        int limit=entity.getLimit();
        if(currpage==1){
            entity.setOffset(currpage-1);
        }else if(currpage>1){
            entity.setOffset((currpage-1)*limit);
        }
        Integer countNum=service.countNum(entity);//查到所有数据数
        List<ArticleComment> list =service.queryAllByLimit(entity);
        for(ArticleComment x:list){
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
    public Map<String, Object> addObj(@RequestBody ArticleComment entity) {
        service.insert(entity);
        if (entity.getId() != null) {
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody ArticleComment entity) {
        if (entity.getId() != null) {
            service.update(entity);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
    }

    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody ArticleComment entity) {
        if (entity.getId() != null) {
            service.deleteById(entity.getId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody ArticleComment entity) {
        if (entity.getId() != null) {
            ArticleComment obj=service.queryById(entity.getId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findSonList")
    public Map<String, Object> findSonList(@RequestBody ArticleComment entity) {
        if (entity.getArtId() != null) {
            List<ArticleComment> obj=service.findAllData(entity);
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
    //  点赞
    @RequestMapping("/DoThumb")
    public Map<String, Object> DoThumb(@RequestBody ArticleComment entity) {
        if (entity.getId() != null) {
            entity.setThumbNum(1);//点赞量++
            ArticleComment obj=service.addNum(entity); //引用DAO 层开始操作数据库
            //增加浏览量 --结束
            return re.SUCCESSOBJ(obj);
        }
        return re.ERROR();
    }

    //  点赞
    @RequestMapping("/updateCommentListUser")
    public Map<String, Object> updateCommentListUser(@RequestBody ArticleComment entity) {
        //offset,limit
        List<ArticleComment> dataList=service.queryAllByLimit(entity);
        log.info("dataList="+dataList.size());
        for(int i=0;i<dataList.size();i++){
            ArticleComment data=dataList.get(i);
            int id=data.getId();
            int artId=data.getArtId();//文章ID
            int thumbNum=0;
            //设置随机用户ID
            Random rand = new Random();
            int userId=rand.nextInt(142)+1;
            //获取文章数据
            Article artData=articleService.queryById(artId);
            int checkNum=artData.getCheckNum();//查看数量
            log.info("checkNum="+checkNum);
            if(checkNum<=1000){
                thumbNum=rand.nextInt(20)+1;//评论点赞量1~20
            }else if(checkNum<5000){
                thumbNum=rand.nextInt(51)+10;//评论点赞量10~60
            }else if(checkNum<100000){
                thumbNum=rand.nextInt(101)+50;//评论点赞量50~150
            }else if(checkNum<500000){
                thumbNum=rand.nextInt(191)+70;//评论点赞量70~260
            }else if(checkNum<1000000){
                thumbNum=rand.nextInt(291)+80;//评论点赞量80~370
            }else if(checkNum<5000000){
                thumbNum=rand.nextInt(381)+100;//评论点赞量100~480
            }else if(checkNum<10000000){
                thumbNum=rand.nextInt(401)+200;//评论点赞量200~600
            }else if(checkNum>=10000000){
                thumbNum=rand.nextInt(701)+300;//评论点赞量300~1000
            }
            log.info("thumbNum="+thumbNum);
            ArticleComment updateParam=new ArticleComment();
            updateParam.setId(id);
            updateParam.setUserId(userId);
            updateParam.setThumbNum(thumbNum);
            service.update(updateParam);
        }
        return re.SUCCESS();
    }

    public static void main(String args[]){
        Random rand = new Random();
        int randomNum=rand.nextInt(143)+1;
        System.out.println(randomNum);
    }
}
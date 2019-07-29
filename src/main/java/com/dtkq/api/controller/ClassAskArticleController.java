package com.dtkq.api.controller;

import com.dtkq.api.entity.ClassAskArticle;
import com.dtkq.api.service.ClassAskArticleService;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
            return re.ERRORMSG("归属值为空！");
        }else {
            List<ClassAskArticle> askArticleList = this.classAskArticleService.queryAll(askArticle);
            for (int i =0 ;i<askArticleList.size();i++){
                if (askArticleList.get(i).getAc_artId()!=null){
                    askArticleList.get(i).getArticle().setArtCommentNum(123);
                    askArticleList.get(i).setManNum(234);
                    askArticleList.get(i).setWomanNum(234);
                }else {
                    askArticleList.get(i).getAsk().setAskCommentNum(123);
                    askArticleList.get(i).setManNum(234);
                    askArticleList.get(i).setWomanNum(234);
                }
            }
            return re.SUCCESSOBJ(askArticleList);
        }
    }
    @RequestMapping("/inset")
    public Map<String,Object> insetHot(@RequestBody ClassAskArticle askArticle){
        if (askArticle.getAc_askId()!=null||askArticle.getAc_artId()!=null){
            ClassAskArticle count = this.classAskArticleService.insert(askArticle);
            if (count.getAcId()!=null){
                return re.SUCCESS();
            }
            return re.ERRORMSG("inset error!");
        }
        return re.ERRORMSG("askId or articleId is null!");
    }


}
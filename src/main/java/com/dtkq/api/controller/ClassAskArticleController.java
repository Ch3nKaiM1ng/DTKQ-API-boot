package com.dtkq.api.controller;

import com.dtkq.api.entity.ClassAskArticle;
import com.dtkq.api.service.ClassAskArticleService;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
    public Map<String,Object> selectHot(ClassAskArticle askArticle){
        if (askArticle.getBelong()==null){
            return re.ERRORMSG("归属值为空！");
        }else {
            this.classAskArticleService.queryAll(askArticle);
        }
        return re.SUCCESS();
    }


}
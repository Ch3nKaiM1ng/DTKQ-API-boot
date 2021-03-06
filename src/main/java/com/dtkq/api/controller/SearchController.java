package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.Article;
import com.dtkq.api.entity.Ask;
import com.dtkq.api.entity.Case;
import com.dtkq.api.entity.Search;
import com.dtkq.api.service.ArticleService;
import com.dtkq.api.service.AskService;
import com.dtkq.api.service.CaseService;
import com.dtkq.api.service.SearchService;
import com.dtkq.api.utils.DateUtils;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Search)表控制层
 *
 * @author makejava
 * @since 2019-08-17 15:35:34
 */
@RestController
@RequestMapping("/search")
public class SearchController {
    /**
     * 服务对象
     */
    @Resource
    private SearchService searchService;
    @Autowired
    private ArticleService articleService;
    @Autowired
    private AskService askService;
    @Autowired
    private CaseService caseService;

    private ReturnDiscern re = new ReturnDiscern();
    private DateUtils time = new DateUtils();
    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @RequestMapping("/selectOne")
    public Map<String,Object> selectOne(@RequestBody Search search) {
        if (search.getsId()!=null){
            search = this.searchService.queryById(search.getsId());
            if (search!=null){
                return re.SUCCESSOBJ(search);
            }
            return re.ERRORMSG("select error!");
        }
        return re.ERRORMSG("sId as null!");
    }

    @RequestMapping("/inset")
    public Map<String,Object>inset(@RequestBody Search search){
        search.setsAddtime(time.NewDate());
        search = this.searchService.insert(search);
        if (search==null){
            return re.ERRORMSG("inset error!");
        }
        return re.SUCCESS();
    }
    @RequestMapping("/update")
    public Map<String,Object>update(@RequestBody Search search){
        if (search.getsId()!=null){
            int count  = this.searchService.update(search);
            if (count>0){
                return re.SUCCESS();
            }
            return re.ERROR();
        }
        return re.ERRORMSG("sId as null!");
    }
    @RequestMapping("/selectall")
    public Map<String,Object>selectAll(@RequestBody Search search){
        Integer offset = (search.getOffset()-1)*search.getLimit();
        List<Search> searchList = this.searchService.queryAllByLimit(offset,search.getLimit(),search.getsBlong());
        for (Search searchs:searchList){
            searchs.setLimit(search.getLimit());
            searchs.setOffset(search.getOffset());
        }
        Map<String,Object> map = new HashMap<>();
        Integer countNum = this.searchService.queryCount(search.getsBlong());
        map.put("countNum",countNum);
        map.put("search",searchList);
        return re.SUCCESSOBJ(map);
    }
    @RequestMapping("/delete")
    public Map<String,Object> delete(@RequestBody Search search){
        if (search.getsId()!=null){
            boolean count = this.searchService.deleteById(search.getsId());
            if (count){
                return re.SUCCESS();
            }
            return re.ERRORMSG("delete error!");
        }
        return re.ERRORMSG("sId as error!");
    }

    @RequestMapping("/selectByKeyWord")
    public Map<String,Object>selectByKeyword(@RequestBody JSONObject jsonObject){
        Map<String,Object> map = new HashMap<>();
        String keyword=jsonObject.get("keyword").toString();
        Integer limit = (Integer)jsonObject.get("limit");
        Integer offset = ((Integer)jsonObject.get("offset")-1)*limit;
        if (keyword!=null){
            List<Article> article = this.articleService.selectByKeyWord(keyword,offset,limit);
//            Integer articleCount = this.articleService.selectByKeyWordNum(keyword);

            List<Ask> ask = this.askService.selectByKeyWord(keyword,offset,limit);

            List<Case> Case = this.caseService.selectByKeyWord(keyword,offset,limit);
//            map.put("articleCount",articleCount);
            map.put("article",article);
            map.put("ask",ask);
            map.put("case",Case);
            map.put("limit",limit);
            map.put("offset",offset+1);

            return re.SUCCESSOBJ(map);
        }
        return re.ERRORMSG("keyword as null!");
    }
}
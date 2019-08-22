package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.Ask;
import com.dtkq.api.entity.Case;
import com.dtkq.api.entity.TrackUser;
import com.dtkq.api.service.TrackUserService;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * (TrackUser)表控制层
 *
 * @author makejava
 * @since 2019-08-20 15:16:37
 */
@RestController
@RequestMapping("trackUser")
public class TrackUserController {
    /**
     * 服务对象
     */
    @Resource
    private TrackUserService service;

    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();

    @Autowired
    HttpServletRequest request;

    HttpServletResponse response;
    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll(@RequestBody TrackUser entity) {
        int currpage=entity.getOffset();//offset 查询起始位置
        int limit=entity.getLimit();//limit 查询条数
        if(currpage==1){
            entity.setOffset(currpage-1);
        }else if(currpage>1){
            entity.setOffset((currpage-1)*limit);
        }

        List<TrackUser> list =service.queryAll(entity);
        Integer countNum =0;
        if(entity.getCheckByIp()>0){//如果不以ip显示，则通过其他方法获取总数据量
            entity.setLimit(0);
            List<TrackUser> listData =service.queryAll(entity);
            countNum=listData.size();
        }else{
            countNum=service.countNum(entity);
        }
        /*List<ArticleComment> list =service.queryAllByLimit(entity);*/
        JSONObject jsonObject=new JSONObject();//组成一个对象
        jsonObject.put("limit",limit);//返回当前页显示条数
        jsonObject.put("currpage",currpage);//返回当前页
        jsonObject.put("countNum",countNum);//总数据
        jsonObject.put("dataList",list);//返回当前数组
        return re.SUCCESSOBJ(jsonObject);
    }

    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody TrackUser entity) {
        if (entity.getId() != null) {
            TrackUser obj=service.queryById(entity.getId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody JSONObject json) {
        re.getIpAndMobileMsg(request,response,json);
            return re.SUCCESS();
    }
}
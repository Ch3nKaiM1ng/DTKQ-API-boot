package com.dtkq.api.controller;

import com.dtkq.api.entity.Banner;
import com.dtkq.api.entity.Banner;
import com.dtkq.api.service.BannerService;
import com.dtkq.api.service.BannerService;
import com.dtkq.api.utils.DateUtils;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RequestMapping("/Banner")
@RestController
public class BannerController {
    @Autowired
    private BannerService service;

    //    时间utils
    private DateUtils data = new DateUtils();
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();


    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll() {

        List<Banner> list =service.selectAll();
        return re.SUCCESSOBJ(list);
    }
    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody Banner Banner) {
        //查询列表已存在的主图数量是否超过5个
        List<Banner> list =service.selectAll();
        if (list.size() >6) {
            return re.ERRORMSG("已经超过6个存在，无法添加");
        }
        else{//如果没有则添加
            service.insertObj(Banner);
            if (Banner.getId() != null) {
                return re.SUCCESS();
            }
        }
        return re.ERROR();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody Banner Banner) {
        if (Banner.getId() != null) {
            service.updateObj(Banner);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
    }
    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody Banner Banner) {
        if (Banner.getId() != null) {
            service.delectById(Banner.getId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody Banner Banner) {
        if (Banner.getId() != null) {
            Banner obj=service.selectObj(Banner.getId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
}

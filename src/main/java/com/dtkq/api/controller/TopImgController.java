package com.dtkq.api.controller;

import com.dtkq.api.entity.TopImg;
import com.dtkq.api.service.TopImgService;
import com.dtkq.api.utils.DateUtils;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RequestMapping("/TopImg")
@RestController
public class TopImgController {
    @Autowired
    private TopImgService topImgService;

    //    时间utils
    private DateUtils data = new DateUtils();
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();


    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll(@RequestBody TopImg topImg) {

        List<TopImg> topImgsList =topImgService.selectAll();
        return re.SUCCESSOBJ(topImgsList);
    }
    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody TopImg topImg) {
        List<TopImg> topImgsList =topImgService.selectAll();
        if (topImgsList.size() >0) {
            return re.ERRORMSG("已经有一个主图存在，无法添加");
        }else{
            Date time=new Date();
            topImg.setCtime(time);
            topImgService.insertObj(topImg);
            if (topImg.getId() != null) {
                return re.SUCCESS();
            }
        }
        return re.ERROR();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody TopImg topImg) {
        if (topImg.getId() != null) {
            topImgService.updateObj(topImg);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
    }
    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody TopImg topImg) {
        if (topImg.getId() != null) {
            topImgService.delectById(topImg.getId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody TopImg topImg) {
        if (topImg.getId() != null) {
            TopImg obj=topImgService.selectObj(topImg.getId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
}

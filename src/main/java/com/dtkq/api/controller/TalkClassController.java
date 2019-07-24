package com.dtkq.api.controller;

import com.dtkq.api.entity.DoctorClass;
import com.dtkq.api.entity.TalkClass;
import com.dtkq.api.service.DoctorClassService;
import com.dtkq.api.service.TalkClassService;
import com.dtkq.api.utils.DateUtils;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RequestMapping("/TalkClass")
@RestController
public class TalkClassController {
    @Autowired
    private TalkClassService service;

    //    时间utils
    private DateUtils data = new DateUtils();
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();


    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll(@RequestBody TalkClass entity) {

        List<TalkClass> list =service.selectAll(entity);
        return re.SUCCESSOBJ(list);
    }
    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody TalkClass entity) {
            Date time;
            time = new Date();
            entity.setCtime(time);
            service.insertObj(entity);

            return re.SUCCESS();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody TalkClass entity) {
        if (entity.getId() != null) {
            service.updateObj(entity);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
    }
    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody TalkClass entity) {
        if (entity.getId() != null) {
            service.delectById(entity.getId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody TalkClass entity) {
        if (entity.getId() != null) {
            TalkClass obj=service.selectObj(entity.getId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
}

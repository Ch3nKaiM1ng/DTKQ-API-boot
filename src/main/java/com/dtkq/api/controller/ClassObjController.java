package com.dtkq.api.controller;

import com.dtkq.api.entity.ClassObj;
import com.dtkq.api.entity.DoctorClass;
import com.dtkq.api.mapper.ClassObjMapper;
import com.dtkq.api.service.ClassObjService;
import com.dtkq.api.service.DoctorClassService;
import com.dtkq.api.utils.DateUtils;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RequestMapping("/ClassObj")
@RestController
public class ClassObjController {
    @Autowired
    private ClassObjService service;

    //    时间utils
    private DateUtils data = new DateUtils();
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();


    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll() {

        List<ClassObj> list =service.selectAll();
        return re.SUCCESSOBJ(list);
    }
    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody ClassObj entity) {
            Date time;
            time = new Date();
            entity.setCtime(time);
            service.insertObj(entity);
            return re.SUCCESS();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody ClassObj entity) {
        if (entity.getObjId() != null) {
            service.updateObj(entity);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
    }
    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody ClassObj entity) {
        if (entity.getObjId() != null) {
            service.delectById(entity);
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody ClassObj entity) {
        if (entity.getObjId() != null) {
            ClassObj obj=service.selectObj(entity);
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
}

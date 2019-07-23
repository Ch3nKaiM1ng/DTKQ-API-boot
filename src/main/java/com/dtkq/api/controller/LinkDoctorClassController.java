package com.dtkq.api.controller;

import com.dtkq.api.entity.DoctorClass;
import com.dtkq.api.entity.LinkDoctorClass;
import com.dtkq.api.service.DoctorClassService;
import com.dtkq.api.service.LinkDoctorClassService;
import com.dtkq.api.utils.DateUtils;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RequestMapping("/LinkDoctorClass")
@RestController
public class LinkDoctorClassController {
    @Autowired
    private LinkDoctorClassService service;

    //    时间utils
    private DateUtils data = new DateUtils();
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();


    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll() {

        List<LinkDoctorClass> list =service.selectAll();
        return re.SUCCESSOBJ(list);
    }
    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody LinkDoctorClass linkDoctorClass) {
            Date time;
            time = new Date();
            linkDoctorClass.setCtime(time);
            service.insertObj(linkDoctorClass);
            return re.SUCCESS();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody LinkDoctorClass linkDoctorClass) {
        if (linkDoctorClass.getClassId() != null) {
            service.updateObj(linkDoctorClass);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
    }
    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody LinkDoctorClass linkDoctorClass) {
        if (linkDoctorClass.getClassId() != null) {
            service.delectById(linkDoctorClass.getClassId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody LinkDoctorClass linkDoctorClass) {
        if (linkDoctorClass.getClassId() != null) {
            LinkDoctorClass  obj=service.selectObj(linkDoctorClass.getClassId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
}

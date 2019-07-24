package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.ClassObj;
import com.dtkq.api.entity.DoctorClass;
import com.dtkq.api.entity.LinkClassObj;
import com.dtkq.api.entity.TalkClass;
import com.dtkq.api.mapper.ClassObjMapper;
import com.dtkq.api.service.ClassObjService;
import com.dtkq.api.service.DoctorClassService;
import com.dtkq.api.service.LinkClassObjService;
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

@RequestMapping("/ClassObj")
@RestController
public class ClassObjController {
    @Autowired
    private ClassObjService service;
    @Autowired
    private LinkClassObjService linkService;
    @Autowired
    private TalkClassService talkClassService;

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

            if(entity.getClassList()==null || entity.getClassList()==""){
                return re.ERRORMSG("缺少分类ID");
            }
            service.insertObj(entity);
            //确定添加成功
            if(entity.getObjId()!=null){
                linkUpdate(entity);
                return re.SUCCESS();
            }
            return re.ERROR();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody ClassObj entity) {
        if(entity.getClassList()==null || entity.getClassList()==""){
            return re.ERRORMSG("缺少分类ID");
        }
        if (entity.getObjId() != null) {
            service.updateObj(entity);
            linkUpdate(entity);
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
            //删除关联表中的相关数据 ---start
            LinkClassObj linkClassObj =new LinkClassObj();
            linkClassObj.setObjId(entity.getObjId());
            linkService.delectById(linkClassObj);
            //删除关联表中的相关数据 ----end
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

    //  前端首页查找所有分类
    @RequestMapping("/WebFindAllClass")
    public Map<String, Object> findAll(@RequestBody TalkClass talkClass) {
        talkClassService.findWebList(talkClass);
        return re.SUCCESSOBJ(talkClassService.findWebList(talkClass));
    }

    //  前端首页查找所有分类
    @RequestMapping("/FindClassObjById")
    public Map<String, Object> FindClassObjById(@RequestBody ClassObj classObj) {
        List<ClassObj> classObjList=service.selectByClassId(classObj);
        return re.SUCCESSOBJ(classObjList);
    }

    private void linkUpdate(ClassObj entity){
        //拆分传过来的classIDList
        LinkClassObj linkClassObj=new LinkClassObj();
        linkClassObj.setObjId(entity.getObjId());
        //删除旧有的关联
        linkService.delectById(linkClassObj);
        //添加新的关联
        linkClassObj.setCtime(new Date());
        linkClassObj.setStatus("0");
        String[] classList=entity.getClassList().split(",");
        //循环添加关联
        for(int i=0;i<classList.length;i++){
            Integer classId=Integer.parseInt(classList[i]);
            linkClassObj.setClassId(classId);
            linkService.insertObj(linkClassObj);
        }
    }
    private void webJsonObj(JSONObject jsonObject){
    }
}



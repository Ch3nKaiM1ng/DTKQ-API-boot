package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.Article;
import com.dtkq.api.entity.Ask;
import com.dtkq.api.entity.Doctor;
import com.dtkq.api.entity.LinkDoctorClass;
import com.dtkq.api.service.DoctorService;
import com.dtkq.api.service.LinkDoctorClassService;
import com.dtkq.api.utils.ReturnDiscern;
import com.dtkq.api.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequestMapping("/Doctor")
@RestController
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private LinkDoctorClassService linkDoctorClassService;

    //    时间utils
    private DateUtils data = new DateUtils();
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();


    //  查找所有医生
    @RequestMapping("/findAll")
    public Map<String, Object> findAll() {

        List<Doctor> doctorList =doctorService.selectAll();
        return re.SUCCESSOBJ(doctorList);
    }
    //  查找所有医生
    @RequestMapping("/select")
    public Map<String, Object> select(@RequestBody Doctor doctor) {

        List<Doctor> doctorList =doctorService.select(doctor);
        return re.SUCCESSOBJ(doctorList);
    }
    //  查找所有医生
    @RequestMapping("/findAllByLimit")
    public Map<String, Object> findAll(@RequestBody Doctor entity) {

        int currpage=entity.getOffset();//offset 查询起始位置
        int limit=entity.getLimit();//limit 查询条数
        if(currpage==1){
            entity.setOffset(currpage-1);
        }else if(currpage>1){
            entity.setOffset((currpage-1)*limit);
        }
        Integer countNum=doctorService.countNum(entity);//查到所有数据数
        JSONObject jsonObject=new JSONObject();//组成一个对象
        List<Doctor> list =doctorService.selectAllByLimit(entity.getOffset(),entity.getLimit());
        jsonObject.put("limit",limit);//返回当前页显示条数
        jsonObject.put("currpage",currpage);//返回当前页
        jsonObject.put("countNum",countNum);//返回当前页
        jsonObject.put("dataList",list);//返回当前数组
        return re.SUCCESSOBJ(jsonObject);
    }

    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody Doctor entity) {
        if (entity.getDoctorId() != null) {
            Doctor obj=doctorService.selectObj(entity);
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
    //  添加医生
    @RequestMapping("/addObj")

    public Map<String, Object> addDoctor(@RequestBody Doctor doctor) {
        if (doctor.getClassList() == null ||doctor.getClassList() =="") {
            return re.ERRORMSG("缺少分类ID字符串");
        }
        doctorService.insertObj(doctor);
        //获取医生分类字符串并且给其进行字符串数组操作
        String[] classList=doctor.getClassList().split(",");
        if (doctor.getDoctorId() != null) {

            for(int i=0;i<classList.length;i++){//添加医生成功后，为其绑定分类操作
                LinkDoctorClass linkDoctorClass=new LinkDoctorClass();
                int classId=Integer.parseInt(classList[i]);
                linkDoctorClass.setClassId(classId);
                linkDoctorClass.setDoctorId(doctor.getDoctorId());
                linkDoctorClassService.insertObj(linkDoctorClass);//医生与医生分类表进行关联操作
            }
            return re.SUCCESS();
        }

        return re.ERROR();
    }

    //  添加医生
    @RequestMapping("/updateObj")

    public Map<String, Object> updateObj(@RequestBody Doctor doctor) {
        if (doctor.getClassList() == null ||doctor.getClassList() =="") {
            return re.ERRORMSG("缺少分类ID字符串");
        }
        doctorService.updateObj(doctor);
        //获取医生分类字符串并且给其进行字符串数组操作
        String[] classList=doctor.getClassList().split(",");
        if (doctor.getDoctorId() != null) {
            LinkDoctorClass linkDoctorClass=new LinkDoctorClass();
            linkDoctorClass.setDoctorId(doctor.getDoctorId());
            linkDoctorClassService.deleteByKey(linkDoctorClass);
            for(int i=0;i<classList.length;i++){//修改医生成功后，为其重新绑定分类操作
                int classId=Integer.parseInt(classList[i]);
                linkDoctorClass.setClassId(classId);
                linkDoctorClassService.insertObj(linkDoctorClass);//医生与医生分类表进行关联操作
            }
            return re.SUCCESS();
        }

        return re.ERROR();
    }
    //  添加医生
    @RequestMapping("/updateStatus")

    public Map<String, Object> updateStatus(@RequestBody Doctor doctor) {
        doctorService.updateObj(doctor);
            return re.SUCCESS();
    }
    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody Doctor entity) {
        if (entity.getDoctorId() != null) {
            doctorService.delectById(entity);
            return re.SUCCESS();
        }
        return re.ERROR();
    }

}

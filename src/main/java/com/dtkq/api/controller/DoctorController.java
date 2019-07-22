package com.dtkq.api.controller;

import com.dtkq.api.entity.Doctor;
import com.dtkq.api.service.DoctorService;
import com.dtkq.api.utils.ReturnDiscern;
import com.dtkq.api.entity.FloatWindow;
import com.dtkq.api.service.FloatWindowService;
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
    private FloatWindowService floatWindowService;

    //    时间utils
    private DateUtils data = new DateUtils();
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();


    //  查找所有医生
    @RequestMapping("/findAll")
    public Map<String, Object> findAll(@RequestBody Doctor doctor) {

        List<Doctor> doctorList =doctorService.selectAll();
        return re.SUCCESSOBJ(doctorList);
    }
    //  添加医生
    @RequestMapping("/addDoctor")
    public Map<String, Object> addDoctor(@RequestBody Doctor doctor) {
        doctorService.insertObj(doctor);
        if (doctor.getDoctorId() != null) {
            return re.SUCCESS();
        }

        return re.ERROR();
    }
    //    查询全部浮框
    @RequestMapping("/findAllFloatWindow")
    public Map<String, Object> findAllFloatWindow() {

        List<FloatWindow> floatWindowList = floatWindowService.selectAll();
        return re.SUCCESSOBJ(floatWindowList);
    }


}

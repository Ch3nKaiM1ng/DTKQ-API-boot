package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.Admin;
import com.dtkq.api.service.AdminService;
import com.dtkq.api.utils.DateUtils;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RequestMapping("/Admin")
@RestController
public class AdminController {
    @Autowired
    private AdminService service;

    //    时间utils
    private DateUtils data = new DateUtils();
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();


    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll() {

        List<Admin> list =service.selectAll();
        return re.SUCCESSOBJ(list);
    }
    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody Admin Admin) {

        //检查用户名是否已经存在--start
        Admin checkParam=new Admin();
        checkParam.setUser(Admin.getUser());
        Admin checkUser= service.checkUser(checkParam);
        if(checkUser!=null){
            return re.ERRORMSG("用户名已经存在");
        }
        //检查用户名是否已经存在--end
        Date time;
        time = new Date();
        Admin.setCtime(time);
        service.insertObj(Admin);
        if (Admin.getId() != null) {
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody Admin Admin) {

        if (Admin.getId() != null) {
            //检查用户名是否已经存在--start
            Admin checkParam=new Admin();
            checkParam.setnId(Admin.getId());
            checkParam.setUser(Admin.getUser());
            Admin checkUser= service.checkUser(checkParam);
            if(checkUser!=null){
                return re.ERRORMSG("用户名已经存在");
            }
            //检查用户名是否已经存在--end

            service.updateObj(Admin);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
    }
    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody Admin Admin) {
        if (Admin.getId() != null) {
            service.delectById(Admin.getId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查找详情
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody Admin Admin) {
        if (Admin.getId() != null) {
            Admin obj=service.selectObj(Admin.getId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
    //  后台登陆
    @RequestMapping("/login")
    public Map<String, Object> login(@RequestBody Admin Admin, HttpSession httpSession) {
        if(Admin.getUser() !=null || Admin.getPassword()!=null){
            Admin obj=service.checkUser(Admin);
            if(obj!=null){
                JSONObject json=new JSONObject();
                json.put("sessionName","adminUser");
                json.put("obj",obj);
                httpSession.setAttribute("adminUser",obj);
                return re.SUCCESSOBJ(json);
            }
        }

        return re.ERROR();
    }
    //  后台登陆
    @RequestMapping("/getUserSession")
    public Map<String, Object> getUserSession(HttpSession httpSession) {
        Admin admin= (Admin) httpSession.getAttribute("adminUser");
        if(admin!=null){
            return re.SUCCESSOBJ(admin);

        }else{
            return re.ERRORMSG("没有用户数据");
        }
    }
}

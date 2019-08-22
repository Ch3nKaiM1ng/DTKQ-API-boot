package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.Admin;
import com.dtkq.api.service.AdminService;
import com.dtkq.api.utils.DateUtils;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.provider.MD5;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    @Autowired
    HttpSession httpSession ;
    @Autowired
    HttpServletRequest request;

    HttpServletResponse response;
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
    @CrossOrigin
    @RequestMapping("/login")
    public Map<String, Object> login(@RequestBody Admin admin) {
        if(admin.getUser() !=null || admin.getPassword()!=null){
            Admin obj=service.checkUser(admin);
            if(obj!=null){
                JSONObject json=new JSONObject();
                json.put("sessionName","adminUser");
                json.put("obj",obj);
                String id=obj.getId().toString();
                httpSession.setAttribute("adminUser",obj);
                httpSession.getAttribute("adminUser");
                return re.SUCCESSOBJ(json);
            }
        }


        return re.ERROR();
    }
    //  后台登陆
    @RequestMapping("/getUserSession")
    @CrossOrigin
    public Map<String, Object> getUserSession() {
        /*System.out.println(request.getHeader("X-Token"));*/
        /*JSONObject json =new JSONObject();
        json.put("action","测试数据");
        json.put("phone","测试手机号码");
        json.put("recordPhone","测试记录号码");
        re.getIpAndMobileMsg(request,response,json);*/
        httpSession.getAttribute("adminUser");
        Admin admin= (Admin) httpSession.getAttribute("adminUser");
        if(admin!=null){
            return re.SUCCESSOBJ(admin);

        }else{
            return re.ERRORMSG("没有用户数据");
        }
    }
    @RequestMapping("/outLogin")
    @CrossOrigin
    public Map<String, Object> outLogin() {
        httpSession.removeAttribute("adminUser");
        return re.SUCCESS();
    }

    public String createTokenByMd5(Admin admin){
        String id=admin.getId().toString()+admin.getUser()+admin.getPassword();
        String token="";
        token=DigestUtils.md5DigestAsHex(id.getBytes());
        return token;
    }
}

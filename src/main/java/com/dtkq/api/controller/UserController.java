package com.dtkq.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtkq.api.entity.User;
import com.dtkq.api.service.UserService;
import com.dtkq.api.utils.DateUtils;
import com.dtkq.api.utils.ReturnDiscern;
import com.dtkq.api.utils.SMSUtils;
import com.dtkq.api.utils.TimeContrastUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:25:16
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService service;
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();
    //    调用信息
    private SMSUtils sms = new SMSUtils();
    //    时间类
    private DateUtils dateUtils = new DateUtils();
    //    时间对比
    private TimeContrastUtils time = new TimeContrastUtils();
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.service.queryById(id);
    }

    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll(@RequestBody User entity) {
        int currpage=entity.getOffset();//offset 查询起始位置
        int limit=entity.getLimit();//limit 查询条数
        entity.setOffset(currpage-1);
        List<User> list =service.queryAll(entity);
        /*List<ArticleComment> list =service.queryAllByLimit(entity);*/
        JSONObject jsonObject=new JSONObject();//组成一个对象
        jsonObject.put("limit",limit);//返回当前页显示条数
        jsonObject.put("currpage",currpage);//返回当前页
        jsonObject.put("dataList",list);//返回当前数组
        return re.SUCCESSOBJ(jsonObject);
    }
    @RequestMapping("/findOurList")
    public Map<String, Object> findOurList() {
        User entity =new User();
        entity.setLimit(5000);
        entity.setOffset(0);
        entity.setAuth(1);
        List<User> list =service.queryAll(entity);
        return re.SUCCESSOBJ(list);
    }
    @RequestMapping("/findRegisterList")
    public Map<String, Object> findRegisterList() {
        User entity =new User();
        entity.setLimit(5000);
        entity.setOffset(0);
        entity.setAuth(0);
        List<User> list =service.queryAll(entity);
        return re.SUCCESSOBJ(list);
    }
    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody User entity) {
        try {
            String birthDay=entity.getBirthday();
            Integer Age=getAge(parse(birthDay));
            entity.setAge(Age);
            service.insert(entity);
            if (entity.getUserId() != null) {
                return re.SUCCESS();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return re.ERROR();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody User entity) {
        try {
            String birthDay=entity.getBirthday();
            Integer Age = getAge(parse(birthDay));
            entity.setAge(Age);
        if (entity.getUserId() != null) {
            service.update(entity);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
        } catch (Exception e) {
            e.printStackTrace();
            return re.ERRORMSG("缺少参数ID");
        }
    }

    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody User entity) {
        if (entity.getUserId() != null) {
            service.deleteById(entity.getUserId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody User entity) {
        if (entity.getUserId() != null) {
            User obj=service.queryById(entity.getUserId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }

//    年龄计算
    public static int getAge(Date birthDay) throws Exception {
        Calendar cal = Calendar.getInstance();

        if (cal.before(birthDay)) {
            throw new IllegalArgumentException(
                    "The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthDay);

        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) age--;
            }else{
                age--;
            }
        }
        return age;
    }
    public static Date parse(String strDate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(strDate);
    }
//    注册用户
    @RequestMapping("/login")
    public Map<String,Object> login(@RequestBody User user, HttpServletRequest req){
        if (user.getUserMobile()==null){
            return re.ERRORMSG("UserMobile as null value!");
        }
//        验证是否存在session||信息有效期已过
        String seTime = (String) req.getSession().getAttribute("time");
        if (seTime==null || !this.time.timeCompare(seTime,1)){
            req.getSession().setAttribute("time",this.dateUtils.Fornat(dateUtils.NewDate()));
        }else {
            return re.TimeError(1);
        }
//      生成随机验证码
        int randNum = new Random().nextInt(9999 - 1000) + 1000;
        System.out.println(randNum);
        req.getSession().setAttribute(user.getUserMobile(), randNum);
        String code = null;
        if (user.getUserMobile()!=null){
            code  = sendMsg(user.getUserMobile(),randNum);
            if (code.equals("00000")){
                req.getSession().setAttribute(user.getUserMobile(),randNum);
                return re.SUCCESS();
            }
            re.CodeVerify(code);
        }
        return re.CodeVerify(code);
    }

//    验证 验证码是否有效
    @RequestMapping("/verifyCode")
    public Map<String, Object> verification(@RequestBody User user, HttpServletRequest req){
        HttpSession session = req.getSession();

        String seTime = (String) session.getAttribute("time");

        if (session.getAttribute(user.getUserMobile()) != null && seTime != null && user.getVerify()!=null) {
            if (time.timeCompare(seTime, 3)) {
                if ((Integer) session.getAttribute(user.getUserMobile())==Integer.parseInt(user.getVerify())) {
                    session.removeAttribute(user.getUserMobile());
                    return re.SUCCESS();
                }
            } else {
                return re.TimeOut();
            }
        }
        return re.ERROR();
    }
//    申请短信验证
    @RequestMapping("/sms")
    public String sendMsg(String phone,Integer randNum){
        return sms.SmsCode(randNum,phone);
    }
//    用户登录
}
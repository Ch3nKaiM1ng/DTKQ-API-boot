package com.dtkq.api.utils;

import java.util.HashMap;
import java.util.Map;

public class ReturnDiscern {
    public Map<String,Object> SUCCESS(){
        Map<String,Object> map = new HashMap<>();
        map.put("code","200");
        map.put("msg","提交成功！");
        return map;
    }
    public Map<String,Object> ERROR(){
        Map<String,Object> map = new HashMap<>();
        map.put("code","500");
        map.put("msg","提交失败！");
        return map;
    }
    public Map<String,Object> ERRORMSG(String msg){
        Map<String,Object> map = new HashMap<>();
        map.put("code","500");
        map.put("msg",msg);
        return map;
    }
    public Map<String,Object> SUCCESSOBJ(Object obj){
        Map<String,Object> map = new HashMap<>();
        map.put("code","200");
        map.put("msg","提交成功！");
        map.put("data",obj);
        return map;
    }
    public Map<String,Object> TimeError(int time){
        Map<String,Object> map = new HashMap<>();
        map.put("code","500");
        map.put("msg","每"+time+"分钟只能申请认证一次！");
        return map;
    }
    public Map<String,Object> TimeOut(){
        Map<String,Object> map = new HashMap<>();
        map.put("code","501");
        map.put("msg","验证码已失效，请重新获取！");
        return map;
    }
    public String video(){
        return "video";
    }
    public String img(){
        return "img";
    }
}

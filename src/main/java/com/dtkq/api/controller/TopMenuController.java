package com.dtkq.api.controller;

import com.dtkq.api.entity.TopImg;
import com.dtkq.api.entity.TopMenu;
import com.dtkq.api.service.TopMenuService;
import com.dtkq.api.utils.DateUtils;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RequestMapping("/TopMenu")
@RestController
public class TopMenuController {
    @Autowired
    private TopMenuService service;

    //    时间utils
    private DateUtils data = new DateUtils();
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();


    //  查找所有
    @RequestMapping("/findAll")
    public Map<String, Object> findAll() {

        List<TopMenu> list =service.selectAll();
        return re.SUCCESSOBJ(list);
    }
    //  添加
    @RequestMapping("/addObj")
    public Map<String, Object> addObj(@RequestBody TopMenu topMenu) {
        //查询列表已存在的主图数量是否超过5个
        List<TopMenu> list =service.selectAll();
        if (list.size() >=5) {
            return re.ERRORMSG("已经超过5个存在，无法添加");
        }
        else{//如果没有则添加
            Date time;
            time = new Date();
            topMenu.setCtime(time);
            service.insertObj(topMenu);
            if (topMenu.getId() != null) {
                return re.SUCCESS();
            }
        }
        return re.ERROR();
    }
    //  修改
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody TopMenu topMenu) {
        if (topMenu.getId() != null) {
            service.updateObj(topMenu);
            return re.SUCCESS();
        }else{
            return re.ERRORMSG("缺少参数ID");
        }
    }

    //  删除
    @RequestMapping("/delObj")
    public Map<String, Object> delObj(@RequestBody TopMenu topMenu) {
        if (topMenu.getId() != null) {
            service.delectById(topMenu.getId());
            return re.SUCCESS();
        }
        return re.ERROR();
    }
    //  查看单个
    @RequestMapping("/findObj")
    public Map<String, Object> findObj(@RequestBody TopMenu topMenu) {
        if (topMenu.getId() != null) {
            TopMenu obj=service.selectObj(topMenu.getId());
            if(obj!=null){
                return re.SUCCESSOBJ(obj);
            }
        }
        return re.ERROR();
    }
}

package com.dtkq.api.controller;

import com.dtkq.api.entity.Subscribe;
import com.dtkq.api.service.SubscribeService;
import com.dtkq.api.utils.DateUtils;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Subscribe)表控制层
 *
 * @author makejava
 * @since 2019-07-24 16:24:30
 */
@RestController
@RequestMapping("/subscribe")
public class SubscribeController {
    /**
     * 服务对象
     */
    @Resource
    private SubscribeService subscribeService;

    /**
     * 返回
     */
    private ReturnDiscern re = new ReturnDiscern();

//    时间
    private DateUtils time = new DateUtils();

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @GetMapping("/selectById")
    public Map<String, Object> selectOne(@RequestBody Subscribe subscribe) {
        if (subscribe.getsId()!=null){
            Object subscribes = this.subscribeService.queryById(subscribe.getsId());
            if (subscribes!=null){
                return re.SUCCESSOBJ(subscribes);
            }
            return re.ERRORMSG("selectById error!");
        }
        return re.ERRORMSG("id as null!");
    }

    /**
     * 插入
     */
    @RequestMapping("/inset")
    public Map<String,Object> inset(@RequestBody Subscribe subscribe){
        System.out.println(subscribe.getdId());
        subscribe.setsName(subscribe.getsName().replace(" ",""));
        if (subscribe!=null){
            subscribe.setsAddtime(this.time.NewDate());
            Subscribe count = this.subscribeService.insert(subscribe);

            if (count!=null){
                return re.SUCCESS();
            }
            return re.ERRORMSG("inset error!");
        }

        return re.ERRORMSG("pass in a null value!");
    }

//    修改
    @RequestMapping("/updateById")
    public Map<String,Object>update(@RequestBody Subscribe subscribe){
        if (subscribe.getsId()!=null){
            Subscribe count = new Subscribe();
            count = this.subscribeService.update(subscribe);
            if (count!=null){
                return re.SUCCESS();
            }
            return re.ERRORMSG("update error!");
        }
        return re.ERRORMSG("sId is null value!");
    }

//    删除
    @RequestMapping("/deleteById")
    public Map<String,Object>deleteById(@RequestBody Subscribe subscribe){
        if (subscribe.getsId()!=null){
            boolean count = this.subscribeService.deleteById(subscribe.getsId());
            if (count){
                return re.SUCCESS();
            }
            return re.ERRORMSG("delete error!");
        }
        return re.ERRORMSG("sId is null value!");
    }
//    查询
    @RequestMapping("/selectAll")
    public Map<String,Object>selectAll(@RequestBody Subscribe subscribe){
        Integer offset = (subscribe.getOffset()-1)*subscribe.getLimit();
        List<Subscribe> subscribes = this.subscribeService.queryAllByLimit(offset,subscribe.getLimit());
        Integer countNum = this.subscribeService.queryCount();
        Map<String,Object> data = new HashMap<>();
        if (subscribes!=null){
            data.put("countNum",countNum);
            data.put("subscribe",subscribes);
            return re.SUCCESSOBJ(data);
        }
        return re.ERRORMSG("Insert the value as null!");
    }

}
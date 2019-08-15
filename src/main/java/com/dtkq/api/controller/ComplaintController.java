package com.dtkq.api.controller;

import com.dtkq.api.entity.Complaint;
import com.dtkq.api.service.ComplaintService;
import com.dtkq.api.utils.DateUtils;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * (Complaint)表控制层
 *
 * @author makejava
 * @since 2019-08-09 10:48:22
 */
@RestController
@RequestMapping("/complaint")
public class ComplaintController {
    /**
     * 服务对象
     */
    @Resource
    private ComplaintService complaintService;

//    返回
    private ReturnDiscern re = new ReturnDiscern();
//    时间
    private DateUtils time = new DateUtils();
    /**
     * 通过主键查询单条数据
     * @return 单条数据
     */
    @GetMapping("/selectById")
    public Map<String, Object> selectOne(@RequestBody Complaint complaint) {
        if (complaint.getId()!=null){
            Complaint complaints = this.complaintService.queryById(complaint.getId());
            if (complaints!=null){
                return re.SUCCESSOBJ(complaints);
            }
            return re.ERRORMSG("select error!");
        }
        return re.ERRORMSG("id as null!");
    }

//    插入
    @RequestMapping("/inset")
    public Map<String,Object>inset(@RequestBody Complaint complaint){
        if (complaint!=null){
            complaint.setCtime(time.NewDate());
            Complaint count = this.complaintService.insert(complaint);
            if (count.getId()!=null){
                return re.SUCCESS();
            }
            return re.ERRORMSG("inset error!");
        }
        return re.ERRORMSG("complaint is null value!");
    }
//    修改投诉建议
    @RequestMapping("/update")
    public Map<String,Object>update(@RequestBody Complaint complaint){
        if (complaint.getId()!=null){
            int count = this.complaintService.update(complaint);
            if (count>0){
                return re.SUCCESS();
            }
            return re.ERRORMSG("update error!");
        }
        return re.ERRORMSG("id as null value!");
    }
//    查询
    @RequestMapping("/select")
    public Map<String,Object>select(@RequestBody Complaint complaint){
        Integer offset = (complaint.getOffset()-1)*complaint.getLimit();
        return re.SUCCESSOBJ(this.complaintService.queryAllByLimit(offset,complaint.getLimit()));
    }

//    删除
    @RequestMapping("/delete")
    public Map<String,Object>delete(@RequestBody Complaint complaint){
        if (complaint.getId()!=null){
            boolean count = this.complaintService.deleteById(complaint.getId());
            if (count){
                return re.SUCCESS();
            }
            return re.ERRORMSG("delete error!");
        }
        return re.ERRORMSG("Id as null value!");
    }
}
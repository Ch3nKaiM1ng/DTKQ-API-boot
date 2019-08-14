package com.dtkq.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (Complaint)实体类
 *
 * @author makejava
 * @since 2019-08-09 11:00:53
 */
public class Complaint implements Serializable {
    private static final long serialVersionUID = 889576664818932103L;
    //投诉ID
    private Integer id;
    //是否有帮助：0有1没有
    private Integer helpstatuts;
    //投诉建议
    private Object content;
    //投诉人联系手机号码
    private String mobile;
    //创建时间
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date ctime;
    //处理状态/0未处理/1已处理
    private Integer treatmentstatus;
    //备注
    private Object remark;

    private Integer offset;

    private Integer limit;

    public Integer getOffset() {
        if("".equals(offset)||offset==null){
            return 0;//去除该属性的前后空格并进行非空非null判断
        }
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        if("".equals(limit)||limit==null){
            return 100;//去除该属性的前后空格并进行非空非null判断
        }
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHelpstatuts() {
        return helpstatuts;
    }

    public void setHelpstatuts(Integer helpstatuts) {
        this.helpstatuts = helpstatuts;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getTreatmentstatus() {
        if("".equals(treatmentstatus)||treatmentstatus==null){
            return 0;//去除该属性的前后空格并进行非空非null判断
        }
        return treatmentstatus;
    }

    public void setTreatmentstatus(Integer treatmentstatus) {
        this.treatmentstatus = treatmentstatus;
    }

    public Object getRemark() {
        return remark;
    }

    public void setRemark(Object remark) {
        this.remark = remark;
    }

}
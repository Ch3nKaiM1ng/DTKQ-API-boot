package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (DoctorTimeBook)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:24:03
 */
public class DoctorTimeBook implements Serializable {
    private static final long serialVersionUID = -43909428692852904L;
    
    private Integer id;
    //预约时间ID
    private Integer timeId;
    //预约人
    private Integer userId;
    //备注
    private String remark;
    //创建时间
    private Date ctime;
    //0正常 1就诊成功 2删除
    private String status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTimeId() {
        return timeId;
    }

    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
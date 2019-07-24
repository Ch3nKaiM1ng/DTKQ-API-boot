package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (DoctorTime)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:23:53
 */
public class DoctorTime implements Serializable {
    private static final long serialVersionUID = -34403881609134810L;
    
    private Integer id;
    //医生ID
    private Integer doctorId;
    //开始时间
    private Date starttime;
    //结束时间
    private Date endtime;
    //预约上线人数
    private Integer bookMax;
    //创建时间
    private Date ctime;
    //0正常 1已删除
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getBookMax() {
        return bookMax;
    }

    public void setBookMax(Integer bookMax) {
        this.bookMax = bookMax;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
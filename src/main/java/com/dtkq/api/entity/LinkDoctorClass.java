package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (LinkDoctorClass)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:24:22
 */
public class LinkDoctorClass implements Serializable {
    private static final long serialVersionUID = 490588250179301440L;
    
    private Integer id;
    //医生ID
    private Integer doctorId;
    //医生分类ID
    private Integer classId;
    //创建时间
    private Date ctime;
    
    private String status;


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

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
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
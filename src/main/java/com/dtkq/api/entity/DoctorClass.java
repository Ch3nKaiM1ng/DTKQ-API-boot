package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (DoctorClass)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:23:45
 */
public class DoctorClass implements Serializable {
    private static final long serialVersionUID = 833129287049782829L;
    
    private Integer classId;
    //医生分类中文名
    private String classChName;
    //医生分类英文名
    private String classEnName;
    //创建时间
    private Date ctime;
    //状态0正常 1删除
    private Integer status;


    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassChName() {
        return classChName;
    }

    public void setClassChName(String classChName) {
        this.classChName = classChName;
    }

    public String getClassEnName() {
        return classEnName;
    }

    public void setClassEnName(String classEnName) {
        this.classEnName = classEnName;
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
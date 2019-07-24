package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (LinkClassObj)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:24:12
 */
public class LinkClassObj implements Serializable {
    private static final long serialVersionUID = -47172271819796469L;
    
    private Integer id;
    //分类ID
    private Integer classId;
    //单位ID
    private Integer objId;
    //创建时间
    private Date ctime;
    
    private String status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getObjId() {
        return objId;
    }

    public void setObjId(Integer objId) {
        this.objId = objId;
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
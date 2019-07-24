package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (AdminAuth)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:21:18
 */
public class AdminAuth implements Serializable {
    private static final long serialVersionUID = 526773470558446126L;
    
    private Integer id;
    //权限名称
    private String authName;
    
    private Date ctime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

}
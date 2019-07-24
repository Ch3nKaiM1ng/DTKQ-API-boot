package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Subscribe)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:24:30
 */
public class Subscribe implements Serializable {
    private static final long serialVersionUID = 190408043301729166L;
    
    private Integer sId;
    //预约医生
    private Integer dId;
    //姓名
    private String sName;
    //手机
    private String sPhone;
    //预约日期
    private String sDate;
    //预约时间
    private String sTime;
    
    private Date sAddtime;


    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public Integer getDId() {
        return dId;
    }

    public void setDId(Integer dId) {
        this.dId = dId;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public String getSPhone() {
        return sPhone;
    }

    public void setSPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getSDate() {
        return sDate;
    }

    public void setSDate(String sDate) {
        this.sDate = sDate;
    }

    public String getSTime() {
        return sTime;
    }

    public void setSTime(String sTime) {
        this.sTime = sTime;
    }

    public Date getSAddtime() {
        return sAddtime;
    }

    public void setSAddtime(Date sAddtime) {
        this.sAddtime = sAddtime;
    }

}
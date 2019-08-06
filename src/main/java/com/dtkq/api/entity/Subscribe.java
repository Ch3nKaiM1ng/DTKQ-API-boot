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

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }

    public String getsTime() {
        return sTime;
    }

    public void setsTime(String sTime) {
        this.sTime = sTime;
    }

    public Date getsAddtime() {
        return sAddtime;
    }

    public void setsAddtime(Date sAddtime) {
        this.sAddtime = sAddtime;
    }
}
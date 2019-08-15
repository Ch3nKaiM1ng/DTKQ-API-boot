package com.dtkq.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (Subscribe)实体类
 *
 * @author makejava
 * @since 2019-08-14 10:26:45
 */
public class Subscribe implements Serializable {
    private static final long serialVersionUID = -84235556061531675L;
    
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

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date sAddtime;
    
    private Integer sState;
    
    private String sRemark;

    private Integer offset;

    private Integer limit;

    private Integer countNum;

    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Integer getCountNum() {
        return countNum;
    }

    public void setCountNum(Integer countNum) {
        this.countNum = countNum;
    }

    public Integer getOffset() {
        if("".equals(offset)||offset==null){
            return 1;//去除该属性的前后空格并进行非空非null判断
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

    public Integer getsState() {
        return sState;
    }

    public void setsState(Integer sState) {
        this.sState = sState;
    }

    public String getsRemark() {
        return sRemark;
    }

    public void setsRemark(String sRemark) {
        this.sRemark = sRemark;
    }
}
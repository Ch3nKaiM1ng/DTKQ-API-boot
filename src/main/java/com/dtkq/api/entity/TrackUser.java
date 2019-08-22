package com.dtkq.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (TrackUser)实体类
 *
 * @author makejava
 * @since 2019-08-20 15:16:37
 */
public class TrackUser implements Serializable {
    private static final long serialVersionUID = 552587987092234178L;
    
    private Integer id;
    //系统
    private String system;
    //IP地址
    private String ipaddr;
    //手机型号
    private String mobile;
    //注册的手机号码
    private String phone;
    //记录的手机号码
    private String recordphone;
    //动作
    private String action;
    //创建时间
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date ctime;
    //当前页
    private int offset;
    //显示数量
    private int limit;
    //显示数量
    private int checkByIp;

    public int getCheckByIp() {
        return checkByIp;
    }

    public void setCheckByIp(int checkByIp) {
        this.checkByIp = checkByIp;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRecordphone() {
        return recordphone;
    }

    public void setRecordphone(String recordphone) {
        this.recordphone = recordphone;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

}
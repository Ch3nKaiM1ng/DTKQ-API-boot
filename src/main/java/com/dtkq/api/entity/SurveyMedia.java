package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SurveyMedia)实体类
 *
 * @author makejava
 * @since 2019-09-03 10:18:09
 */
public class SurveyMedia implements Serializable {
    private static final long serialVersionUID = 665400239381310636L;
    
    private Integer id;
    //状态
    private String state;
    //年龄
    private String age;
    //姓名
    private String name;
    //手机
    private String phone;
    //添加时间
    private Date addtime;
    //备注
    private String remark;
    //渠道
    private String channel;
    //矫正方式
    private String manner;
    //关注
    private String attention;
    //微信
    private String wechat;
    //检查
    private String inspect;
    //预约时间
    private String appointment;
    //当前页
    private int offset;
    //显示数量
    private int limit;

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getManner() {
        return manner;
    }

    public void setManner(String manner) {
        this.manner = manner;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getInspect() {
        return inspect;
    }

    public void setInspect(String inspect) {
        this.inspect = inspect;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

}
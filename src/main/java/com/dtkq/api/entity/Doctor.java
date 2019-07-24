package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Doctor)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:23:34
 */
public class Doctor implements Serializable {
    private static final long serialVersionUID = -89680316911404788L;
    
    private Integer doctorId;
    //医生分类ID
    private Integer classId;
    //中文名称
    private String doctorChName;
    //英文名称
    private String doctorEnName;
    //中文职位
    private String doctorChPosition;
    //英文职位
    private String doctorEnPosition;
    //医生简介
    private String doctorIntroduction;
    //医生图片
    private String doctorImg;
    //性别
    private Integer doctorSex;
    //联系电话
    private String doctorMobile;
    //电子邮箱
    private String doctorEmail;
    //创建时间
    private Date ctime;
    //0正常 1已删除
    private Integer status;


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

    public String getDoctorChName() {
        return doctorChName;
    }

    public void setDoctorChName(String doctorChName) {
        this.doctorChName = doctorChName;
    }

    public String getDoctorEnName() {
        return doctorEnName;
    }

    public void setDoctorEnName(String doctorEnName) {
        this.doctorEnName = doctorEnName;
    }

    public String getDoctorChPosition() {
        return doctorChPosition;
    }

    public void setDoctorChPosition(String doctorChPosition) {
        this.doctorChPosition = doctorChPosition;
    }

    public String getDoctorEnPosition() {
        return doctorEnPosition;
    }

    public void setDoctorEnPosition(String doctorEnPosition) {
        this.doctorEnPosition = doctorEnPosition;
    }

    public String getDoctorIntroduction() {
        return doctorIntroduction;
    }

    public void setDoctorIntroduction(String doctorIntroduction) {
        this.doctorIntroduction = doctorIntroduction;
    }

    public String getDoctorImg() {
        return doctorImg;
    }

    public void setDoctorImg(String doctorImg) {
        this.doctorImg = doctorImg;
    }

    public Integer getDoctorSex() {
        return doctorSex;
    }

    public void setDoctorSex(Integer doctorSex) {
        this.doctorSex = doctorSex;
    }

    public String getDoctorMobile() {
        return doctorMobile;
    }

    public void setDoctorMobile(String doctorMobile) {
        this.doctorMobile = doctorMobile;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
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
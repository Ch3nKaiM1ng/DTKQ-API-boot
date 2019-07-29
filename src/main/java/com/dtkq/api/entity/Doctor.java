package com.dtkq.api.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Doctor implements Serializable {
    private Integer doctorId;
    private Integer classId;
    private String doctorChName;
    private String doctorEnName;
    private String doctorChPosition;
    private String doctorEnPosition;
    private String doctorIntroduction;
    private String doctorImg;
    private String doctorMobile;
    private String doctorEmail;
    private Integer status;
    private Integer doctorSex;
    private String doctorCode;
    private Integer doctorConsult;
    private Integer doctorBooknum;
    private Integer doctorWorkyear;
    private Integer doctorGrade;
    private Integer doctorGoodReception;
    private Date ctime;
    private String classList;
    private List<DoctorClass> doctorClasses;

    public List<DoctorClass> getDoctorClasses() {
        return doctorClasses;
    }

    public void setDoctorClasses(List<DoctorClass> doctorClasses) {
        this.doctorClasses = doctorClasses;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public Integer getDoctorConsult() {
        return doctorConsult;
    }

    public void setDoctorConsult(Integer doctorConsult) {
        this.doctorConsult = doctorConsult;
    }

    public Integer getDoctorBooknum() {
        return doctorBooknum;
    }

    public void setDoctorBooknum(Integer doctorBooknum) {
        this.doctorBooknum = doctorBooknum;
    }

    public Integer getDoctorWorkyear() {
        return doctorWorkyear;
    }

    public void setDoctorWorkyear(Integer doctorWorkyear) {
        this.doctorWorkyear = doctorWorkyear;
    }

    public Integer getDoctorGrade() {
        return doctorGrade;
    }

    public void setDoctorGrade(Integer doctorGrade) {
        this.doctorGrade = doctorGrade;
    }

    public Integer getDoctorGoodReception() {
        return doctorGoodReception;
    }

    public void setDoctorGoodReception(Integer doctorGoodReception) {
        this.doctorGoodReception = doctorGoodReception;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDoctorSex() {
        return doctorSex;
    }

    public void setDoctorSex(Integer doctorSex) {
        this.doctorSex = doctorSex;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

}
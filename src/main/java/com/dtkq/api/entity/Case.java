package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Case)实体类
 *
 * @author makejava
 * @since 2019-07-26 17:38:48
 */
public class Case implements Serializable {
    private static final long serialVersionUID = -58110677406823394L;
    
    private Integer id;
    
    private Integer userId;
    
    private Integer doctorId;
    
    private String caseName;
    
    private String caseTitle;
    
    private String caseImg;
    
    private Date ctime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getCaseTitle() {
        return caseTitle;
    }

    public void setCaseTitle(String caseTitle) {
        this.caseTitle = caseTitle;
    }

    public String getCaseImg() {
        return caseImg;
    }

    public void setCaseImg(String caseImg) {
        this.caseImg = caseImg;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

}
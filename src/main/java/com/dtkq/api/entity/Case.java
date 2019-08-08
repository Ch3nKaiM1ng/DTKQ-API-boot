package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

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

    private Integer classId;

    private String caseName;
    
    private String caseTitle;
    
    private String caseImg;
    
    private Date ctime;

    //当前页
    private int offset;
    //显示数量
    private int limit;
    private int style;
    private int caseChecknum;
    private int caseThumbnum;
    private int caseCommentnum;
    private User userData;
    private Doctor doctorData;
    private TalkClass classDetail;
    private List<CaseDetail> caseDetailList;

    public TalkClass getClassDetail() {
        return classDetail;
    }

    public void setClassDetail(TalkClass classDetail) {
        this.classDetail = classDetail;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public List<CaseDetail> getCaseDetailList() {
        return caseDetailList;
    }

    public void setCaseDetailList(List<CaseDetail> caseDetailList) {
        this.caseDetailList = caseDetailList;
    }

    public int getCaseCommentnum() {
        return caseCommentnum;
    }

    public void setCaseCommentnum(int caseCommentnum) {
        this.caseCommentnum = caseCommentnum;
    }

    public Doctor getDoctorData() {
        return doctorData;
    }

    public void setDoctorData(Doctor doctorData) {
        this.doctorData = doctorData;
    }

    public User getUserData() {
        return userData;
    }

    public void setUserData(User userData) {
        this.userData = userData;
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

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public int getCaseChecknum() {
        return caseChecknum;
    }

    public void setCaseChecknum(int caseChecknum) {
        this.caseChecknum = caseChecknum;
    }

    public int getCaseThumbnum() {
        return caseThumbnum;
    }

    public void setCaseThumbnum(int caseThumbnum) {
        this.caseThumbnum = caseThumbnum;
    }

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
package com.dtkq.api.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ClassObj implements Serializable {
    private Integer objId;
    private Integer userId;
    private String title;
    private String url;
    private String img;
    private String status;
    private String classList;
    private Date ctime;
    private Integer linkClassId;
    private List<LinkClassObj> classObjList;
    public Integer getObjId() {
        return objId;
    }

    public void setObjId(Integer objId) {
        this.objId = objId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public List<LinkClassObj> getClassObjList() {
        return classObjList;
    }

    public void setClassObjList(List<LinkClassObj> classObjList) {
        this.classObjList = classObjList;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }

    public Integer getLinkClassId() {
        return linkClassId;
    }

    public void setLinkClassId(Integer linkClassId) {
        this.linkClassId = linkClassId;
    }
}
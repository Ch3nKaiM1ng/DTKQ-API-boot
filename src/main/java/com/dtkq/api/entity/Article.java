package com.dtkq.api.entity;

import java.io.Serializable;

/**
 * (Article)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:21:24
 */
public class Article implements Serializable {
    private static final long serialVersionUID = -91424071289340499L;
    //文章ID
    private Integer artId;
    //文章分类ID
    private Integer classId;
    //创建文章的用户ID
    private Integer artUserId;
    //文章标题
    private String artTitle;
    //文章内容
    private Object artContent;
    //文章图片
    private String artImg;
    //文章视频
    private String artVedio;
    //创建时间
    private String cime;
    //0正常 1删除
    private Integer status;
    //标签
    private String label;


    public Integer getArtId() {
        return artId;
    }

    public void setArtId(Integer artId) {
        this.artId = artId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getArtUserId() {
        return artUserId;
    }

    public void setArtUserId(Integer artUserId) {
        this.artUserId = artUserId;
    }

    public String getArtTitle() {
        return artTitle;
    }

    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle;
    }

    public Object getArtContent() {
        return artContent;
    }

    public void setArtContent(Object artContent) {
        this.artContent = artContent;
    }

    public String getArtImg() {
        return artImg;
    }

    public void setArtImg(String artImg) {
        this.artImg = artImg;
    }

    public String getArtVedio() {
        return artVedio;
    }

    public void setArtVedio(String artVedio) {
        this.artVedio = artVedio;
    }

    public String getCime() {
        return cime;
    }

    public void setCime(String cime) {
        this.cime = cime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
package com.dtkq.api.entity;

import java.io.Serializable;

/**
 * (Banner)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:23:00
 */
public class Banner implements Serializable {
    private static final long serialVersionUID = 884399813905695167L;
    
    private Integer id;
    //轮播图图片地址
    private String bannerImg;
    //跳转链接
    private String bannerUrl;
    //排序0最前
    private Integer auth;
    //0正常 1已删除
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public Integer getAuth() {
        return auth;
    }

    public void setAuth(Integer auth) {
        this.auth = auth;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
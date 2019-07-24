package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (ClassObj)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:23:20
 */
public class ClassObj implements Serializable {
    private static final long serialVersionUID = -16011957455563929L;
    
    private Integer objId;
    
    private Integer userId;
    //标题
    private String title;
    //链接
    private String url;
    //图片
    private String img;
    //0正常 1删除
    private String status;
    //创建时间
    private Date ctime;


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

}
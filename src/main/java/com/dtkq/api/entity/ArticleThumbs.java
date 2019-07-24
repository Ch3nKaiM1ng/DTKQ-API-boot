package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (ArticleThumbs)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:21:50
 */
public class ArticleThumbs implements Serializable {
    private static final long serialVersionUID = -37687179472517681L;
    
    private Integer id;
    //文章ID
    private Integer artId;
    //点赞人
    private Integer userId;
    
    private Date ctime;
    //0正常 1以取消
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArtId() {
        return artId;
    }

    public void setArtId(Integer artId) {
        this.artId = artId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
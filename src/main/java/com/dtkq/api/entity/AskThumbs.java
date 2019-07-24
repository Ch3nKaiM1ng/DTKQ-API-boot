package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (AskThumbs)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:22:36
 */
public class AskThumbs implements Serializable {
    private static final long serialVersionUID = -88120988268949087L;
    
    private Integer id;
    //问答ID
    private Integer askId;
    //点赞人ID
    private Integer userId;
    
    private Date ctime;
    //0点赞 1以取消
    private String status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAskId() {
        return askId;
    }

    public void setAskId(Integer askId) {
        this.askId = askId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
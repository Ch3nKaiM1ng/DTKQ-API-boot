package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (UserTalkRead)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:25:33
 */
public class UserTalkRead implements Serializable {
    private static final long serialVersionUID = 856111358916682179L;
    
    private Integer id;
    //用户ID
    private Integer userId;
    //对话ID
    private Integer talkId;
    
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

    public Integer getTalkId() {
        return talkId;
    }

    public void setTalkId(Integer talkId) {
        this.talkId = talkId;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

}
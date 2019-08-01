package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (AskAnswer)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:22:08
 */
public class AskAnswer implements Serializable {
    private static final long serialVersionUID = 853483686553702918L;
    
    private Integer id;
    //问题ID
    private Integer askId;
    //答复用户ID
    private Integer userId;
    //标题
    private String title;
    //内容
    private Object content;
    //创建时间
    private Date ctime;
    //0正常1已删除
    private String status;
    //当前页
    private int offset;
    //显示数量
    private int limit;
    private User user;
    //点赞量
    private Integer thumbNum;



    public Integer getThumbNum() {
        return thumbNum;
    }

    public void setThumbNum(Integer thumbNum) {
        this.thumbNum = thumbNum;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
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
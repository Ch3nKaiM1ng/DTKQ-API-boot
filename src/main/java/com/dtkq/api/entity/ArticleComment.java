package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * (ArticleComment)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:21:37
 */
public class ArticleComment implements Serializable {
    private static final long serialVersionUID = 744459450922789387L;
    
    private Integer id;
    //文章ID
    private Integer artId;
    //父ID 以下情况：文章被用户A评论，然后B用户对A进行评论
    private Integer parentId;
    //评论等级：0回复文章，1回复评论人
    private Integer level;
    //用户ID
    private Integer userId;
    //内容
    private Object content;
    //创建时间
    private Date ctime;
    //0正常 1已删除
    private Integer status;
    //标签
    private int offset;
    //标签
    private int limit;

    private User user;

    private int commentList;

    public int getCommentList() {
        return commentList;
    }

    public void setCommentList(int commentList) {
        this.commentList = commentList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
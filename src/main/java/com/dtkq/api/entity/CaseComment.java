package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (CaseComment)实体类
 *
 * @author makejava
 * @since 2019-07-26 17:39:28
 */
public class CaseComment implements Serializable {
    private static final long serialVersionUID = 744440612193401594L;
    
    private Integer id;
    
    private Integer caseId;
    //父ID 以下情况：文章被用户A评论，然后B用户对A进行评论
    private Integer parentId;
    //评论等级：0回复文章，1回复评论人
    private Integer level;
    //用户ID
    private Integer userId;
    //内容
    private String content;
    //创建时间
    private Date ctime;
    //0正常 1已删除
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
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
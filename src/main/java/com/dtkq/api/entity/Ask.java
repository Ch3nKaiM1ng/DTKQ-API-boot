package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Ask)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:21:56
 */
public class Ask implements Serializable {
    private static final long serialVersionUID = -86809733272129374L;
    
    private Integer askId;
    //问答分类ID
    private Integer askClassId;
    //创建的用户ID
    private Integer askUserId;
    //问答标题
    private String askTitle;

    private String askIntroduction;

    private Object askContent;
    //问答图片
    private String askImg;
    //问答视频
    private String askVedio;
    
    private Date ctime;
    //0正常 1删除
    private Integer status;
    //标签
    private String askLabel;
    //当前页
    private int offset;
    //显示数量
    private int limit;

    private Integer askCommentNum;

    private User user;

    //浏览量
    private Integer askCheckNum;
    //点赞量
    private Integer thumbNum;

    public String getAskIntroduction() {
        return askIntroduction;
    }

    public void setAskIntroduction(String askIntroduction) {
        this.askIntroduction = askIntroduction;
    }

    public Integer getAskId() {
        return askId;
    }

    public void setAskId(Integer askId) {
        this.askId = askId;
    }

    public Integer getAskClassId() {
        return askClassId;
    }

    public void setAskClassId(Integer askClassId) {
        this.askClassId = askClassId;
    }

    public Integer getAskUserId() {
        return askUserId;
    }

    public void setAskUserId(Integer askUserId) {
        this.askUserId = askUserId;
    }

    public String getAskTitle() {
        return askTitle;
    }

    public void setAskTitle(String askTitle) {
        this.askTitle = askTitle;
    }

    public Object getAskContent() {
        return askContent;
    }

    public void setAskContent(Object askContent) {
        this.askContent = askContent;
    }

    public String getAskImg() {
        return askImg;
    }

    public void setAskImg(String askImg) {
        this.askImg = askImg;
    }

    public String getAskVedio() {
        return askVedio;
    }

    public void setAskVedio(String askVedio) {
        this.askVedio = askVedio;
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

    public String getAskLabel() {
        return askLabel;
    }

    public void setAskLabel(String askLabel) {
        this.askLabel = askLabel;
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

    public Integer getAskCommentNum() {
        return askCommentNum;
    }

    public void setAskCommentNum(Integer askCommentNum) {
        this.askCommentNum = askCommentNum;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getAskCheckNum() {
        return askCheckNum;
    }

    public void setAskCheckNum(Integer askCheckNum) {
        this.askCheckNum = askCheckNum;
    }

    public Integer getThumbNum() {
        return thumbNum;
    }

    public void setThumbNum(Integer thumbNum) {
        this.thumbNum = thumbNum;
    }
}
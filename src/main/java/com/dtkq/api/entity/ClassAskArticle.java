package com.dtkq.api.entity;

import java.io.Serializable;

/**
 * (ClassAskArticle)实体类
 *
 * @author makejava
 * @since 2019-07-24 17:40:11
 */
public class ClassAskArticle implements Serializable {
    private static final long serialVersionUID = -88297784604914346L;
    
    private Integer acId;
    //文章ID
    private Integer ac_artId;
    //问答ID
    private Integer ac_askId;
    //视频ID
    private Integer vioId;
    //归属
    private String belong;

    private Ask ask;

    private Article article;

//    男性数量
    private Integer manNum;

//    女性数量
    private Integer womanNum;

    //当前页
    private Integer offset;
    //显示数量
    private Integer limit;
    private User user;

    public Integer getOffset() {
        if ("".equals(offset)||offset==null){
            return 0;
        }
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        if("".equals(limit)||limit==null){
            return 5 ;//去除该属性的前后空格并进行非空非null判断
        }
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

    public Integer getManNum() {
        return manNum;
    }

    public void setManNum(Integer manNum) {
        this.manNum = manNum;
    }

    public Integer getWomanNum() {
        return womanNum;
    }

    public void setWomanNum(Integer womanNum) {
        this.womanNum = womanNum;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public Integer getAc_artId() {
        return ac_artId;
    }

    public void setAc_artId(Integer ac_artId) {
        this.ac_artId = ac_artId;
    }

    public Integer getAc_askId() {
        return ac_askId;
    }

    public void setAc_askId(Integer ac_askId) {
        this.ac_askId = ac_askId;
    }

    public Integer getVioId() {
        return vioId;
    }

    public void setVioId(Integer vioId) {
        this.vioId = vioId;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public Ask getAsk() {
        return ask;
    }

    public void setAsk(Ask ask) {
        this.ask = ask;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
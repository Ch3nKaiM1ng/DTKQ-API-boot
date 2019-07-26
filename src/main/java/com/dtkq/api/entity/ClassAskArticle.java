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

    private Article article;

    private Ask ask;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Ask getAsk() {
        return ask;
    }

    public void setAsk(Ask ask) {
        this.ask = ask;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public Integer getac_artId() {
        return ac_artId;
    }

    public void setac_artId(Integer ac_artId) {
        this.ac_artId = ac_artId;
    }

    public Integer getac_askId() {
        return ac_askId;
    }

    public void setac_askId(Integer ac_askId) {
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

}
package com.dtkq.api.entity;

import java.io.Serializable;

/**
 * (ClassAskArticle)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:23:11
 */
public class ClassAskArticle implements Serializable {
    private static final long serialVersionUID = -70846882871204189L;
    
    private Integer acId;
    //文章ID
    private Integer artId;
    //问答ID
    private Integer askId;
    //视频ID
    private Integer vioId;
    //排序
    private String rank;


    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public Integer getArtId() {
        return artId;
    }

    public void setArtId(Integer artId) {
        this.artId = artId;
    }

    public Integer getAskId() {
        return askId;
    }

    public void setAskId(Integer askId) {
        this.askId = askId;
    }

    public Integer getVioId() {
        return vioId;
    }

    public void setVioId(Integer vioId) {
        this.vioId = vioId;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

}
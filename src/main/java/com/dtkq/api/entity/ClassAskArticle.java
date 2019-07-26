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
//    文章标题
    private String artTitle;
//    文章浏览量
    private Integer artCheckNum;
//    文章评论数
    private Integer artCommentNum;
//    问答标题
    private String askTitle;
//    问答浏览量
    private Integer askCheckNum;
//    问答评论数
    private Integer askCommentNum;
//    问答图片
    private String askImg;


    public String getAskImg() {
        return askImg;
    }

    public void setAskImg(String askImg) {
        this.askImg = askImg;
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

    public String getArtTitle() {
        return artTitle;
    }

    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle;
    }

    public Integer getArtCheckNum() {
        return artCheckNum;
    }

    public void setArtCheckNum(Integer artCheckNum) {
        this.artCheckNum = artCheckNum;
    }

    public Integer getartCommentNum() {
        return artCommentNum;
    }

    public void setartCommentNum(Integer artCommentNum) {
        this.artCommentNum = artCommentNum;
    }

    public String getAskTitle() {
        return askTitle;
    }

    public void setAskTitle(String askTitle) {
        this.askTitle = askTitle;
    }

    public Integer getAskCheckNum() {
        return askCheckNum;
    }

    public void setAskCheckNum(Integer askCheckNum) {
        this.askCheckNum = askCheckNum;
    }

    public Integer getaskCommentNum() {
        return askCommentNum;
    }

    public void setaskCommentNum(Integer askCommentNum) {
        this.askCommentNum = askCommentNum;
    }
}
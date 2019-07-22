package com.dtkq.api.entity;

import java.io.Serializable;

public class Banner implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.banner_img
     *
     * @mbg.generated
     */
    private String bannerImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.banner_url
     *
     * @mbg.generated
     */
    private String bannerUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.auth
     *
     * @mbg.generated
     */
    private Integer auth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table banner
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.id
     *
     * @return the value of banner.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.id
     *
     * @param id the value for banner.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.banner_img
     *
     * @return the value of banner.banner_img
     *
     * @mbg.generated
     */
    public String getBannerImg() {
        return bannerImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.banner_img
     *
     * @param bannerImg the value for banner.banner_img
     *
     * @mbg.generated
     */
    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg == null ? null : bannerImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.banner_url
     *
     * @return the value of banner.banner_url
     *
     * @mbg.generated
     */
    public String getBannerUrl() {
        return bannerUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.banner_url
     *
     * @param bannerUrl the value for banner.banner_url
     *
     * @mbg.generated
     */
    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl == null ? null : bannerUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.auth
     *
     * @return the value of banner.auth
     *
     * @mbg.generated
     */
    public Integer getAuth() {
        return auth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.auth
     *
     * @param auth the value for banner.auth
     *
     * @mbg.generated
     */
    public void setAuth(Integer auth) {
        this.auth = auth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.status
     *
     * @return the value of banner.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.status
     *
     * @param status the value for banner.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bannerImg=").append(bannerImg);
        sb.append(", bannerUrl=").append(bannerUrl);
        sb.append(", auth=").append(auth);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.dtkq.api.entity;

import java.io.Serializable;
import java.util.Date;

public class TopMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column top_menu.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column top_menu.ch_name
     *
     * @mbg.generated
     */
    private String chName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column top_menu.en_name
     *
     * @mbg.generated
     */
    private String enName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column top_menu.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column top_menu.priority
     *
     * @mbg.generated
     */
    private Integer priority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column top_menu.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column top_menu.ctime
     *
     * @mbg.generated
     */
    private Date ctime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table top_menu
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column top_menu.id
     *
     * @return the value of top_menu.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column top_menu.id
     *
     * @param id the value for top_menu.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column top_menu.ch_name
     *
     * @return the value of top_menu.ch_name
     *
     * @mbg.generated
     */
    public String getChName() {
        return chName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column top_menu.ch_name
     *
     * @param chName the value for top_menu.ch_name
     *
     * @mbg.generated
     */
    public void setChName(String chName) {
        this.chName = chName == null ? null : chName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column top_menu.en_name
     *
     * @return the value of top_menu.en_name
     *
     * @mbg.generated
     */
    public String getEnName() {
        return enName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column top_menu.en_name
     *
     * @param enName the value for top_menu.en_name
     *
     * @mbg.generated
     */
    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column top_menu.url
     *
     * @return the value of top_menu.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column top_menu.url
     *
     * @param url the value for top_menu.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column top_menu.priority
     *
     * @return the value of top_menu.priority
     *
     * @mbg.generated
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column top_menu.priority
     *
     * @param priority the value for top_menu.priority
     *
     * @mbg.generated
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column top_menu.status
     *
     * @return the value of top_menu.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column top_menu.status
     *
     * @param status the value for top_menu.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column top_menu.ctime
     *
     * @return the value of top_menu.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column top_menu.ctime
     *
     * @param ctime the value for top_menu.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table top_menu
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
        sb.append(", chName=").append(chName);
        sb.append(", enName=").append(enName);
        sb.append(", url=").append(url);
        sb.append(", priority=").append(priority);
        sb.append(", status=").append(status);
        sb.append(", ctime=").append(ctime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TopMenu)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:25:06
 */
public class TopMenu implements Serializable {
    private static final long serialVersionUID = 205735405806755540L;
    //menuId
    private Integer id;
    //中文名
    private String chName;
    //英文名
    private String enName;
    //跳转链接
    private String url;
    //排序优先级：1为最高
    private Integer priority;
    //状态：0正常，1不显示
    private Integer status;
    //创建时间
    private Date ctime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

}
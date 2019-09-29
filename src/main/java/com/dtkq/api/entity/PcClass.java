package com.dtkq.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * (PcClass)实体类
 *
 * @author makejava
 * @since 2019-09-19 15:21:29
 */
public class PcClass implements Serializable {
    private static final long serialVersionUID = 817243194258777554L;
    //分类ID
    private Integer id;
    //分类等级1：一级分类2：二级分类
    private String level;
    //父ID
    private Integer parentId;
    //中文名称
    private String chName;
    //跳转链接
    private String url;
    //排序：0为最高
    private Integer auth;
    //创建时间
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date ctime;
    //1头部分类 2底部分类 
    private Integer style;
    //链接是否可用0可用1不可用
    private Integer status;

    private List<PcClass> sonList;

    public List<PcClass> getSonList() {
        return sonList;
    }

    public void setSonList(List<PcClass> sonList) {
        this.sonList = sonList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getAuth() {
        return auth;
    }

    public void setAuth(Integer auth) {
        this.auth = auth;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
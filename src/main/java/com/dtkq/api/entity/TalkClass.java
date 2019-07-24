package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TalkClass)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:24:49
 */
public class TalkClass implements Serializable {
    private static final long serialVersionUID = -38787594819404053L;
    //分类ID
    private Integer id;
    //分类等级1：一级分类2：二级分类3：三级分类
    private String level;
    
    private Integer parentId;
    
    private String chName;
    
    private String enName;
    //排序：0为最高
    private Integer auth;
    //创建时间
    private Date ctime;
    //1文章分类 2榜单分类 3首页单位分类
    private Integer style;
    //状态
    private Integer status;


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

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
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
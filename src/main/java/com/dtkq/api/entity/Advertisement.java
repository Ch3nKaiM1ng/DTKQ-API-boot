package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Advertisement)实体类
 *
 * @author makejava
 * @since 2019-08-16 14:07:47
 */
public class Advertisement implements Serializable {
    private static final long serialVersionUID = 707827912768264788L;
    
    private Integer id;
    private Integer clicknum;
    //图片
    private String img;
    //跳转连接
    private String url;
    //状态0正常
    private String status;
    //排序
    private String rank;
    //创建时间
    private Date ctime;
    //当前页
    private int offset;
    //显示数量
    private int limit;

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

}
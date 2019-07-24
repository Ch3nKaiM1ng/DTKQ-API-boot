package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TopImg)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:24:57
 */
public class TopImg implements Serializable {
    private static final long serialVersionUID = 140686758518769873L;
    
    private Integer id;
    //背景图片链接
    private String bgImg;
    //状态0正常1不显示
    private Integer status;
    //创建时间
    private Date ctime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBgImg() {
        return bgImg;
    }

    public void setBgImg(String bgImg) {
        this.bgImg = bgImg;
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
package com.dtkq.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (Search)实体类
 *
 * @author makejava
 * @since 2019-08-17 15:35:34
 */
public class Search implements Serializable {
    private static final long serialVersionUID = 621260737479534849L;
    
    private Integer sId;
    
    private String sKeyword;
    
    private Object sContent;
    
    private Object sUrl;
    
    private String sBlong;
    
    private String sRank;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date sAddtime;

    private Integer offset;

    private Integer limit;
    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsKeyword() {
        return sKeyword;
    }

    public void setsKeyword(String sKeyword) {
        this.sKeyword = sKeyword;
    }

    public Object getsContent() {
        return sContent;
    }

    public void setsContent(Object sContent) {
        this.sContent = sContent;
    }

    public Object getsUrl() {
        return sUrl;
    }

    public void setsUrl(Object sUrl) {
        this.sUrl = sUrl;
    }

    public String getsBlong() {
        return sBlong;
    }

    public void setsBlong(String sBlong) {
        this.sBlong = sBlong;
    }

    public String getsRank() {
        return sRank;
    }

    public void setsRank(String sRank) {
        this.sRank = sRank;
    }

    public Date getsAddtime() {
        return sAddtime;
    }

    public void setsAddtime(Date sAddtime) {
        this.sAddtime = sAddtime;
    }

    public Integer getOffset() {
        if ("".equals(offset)||offset==null){
            return 1;
        }
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        if ("".equals(limit)||limit==null){
            return 100;
        }
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
package com.dtkq.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (CaseDetail)实体类
 *
 * @author makejava
 * @since 2019-07-26 17:39:28
 */
public class CaseDetail implements Serializable {
    private static final long serialVersionUID = 572895510834188142L;
    
    private Integer id;
    //案例ID
    private Integer caseId;
    //标题
    private String title;
    //标签
    private String label;
    //图片串，中间用逗号隔开
    private String img;
    //天数
    private Integer days;
    //内容
    private String content;
    //关键词
    private String keyword;
    //关键词
    private Date ctime;

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

}
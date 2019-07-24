package com.dtkq.api.entity;

import java.io.Serializable;

/**
 * (BackMenu)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:22:50
 */
public class BackMenu implements Serializable {
    private static final long serialVersionUID = -78298313735894513L;
    
    private Integer menuId;
    //分类0一级分类 1二级分类
    private String level;
    //二级分类的父ID
    private Integer parentId;
    //标题
    private String title;
    //排序0最高
    private Integer priority;


    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

}
package com.dtkq.api.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (AuthMenu)实体类
 *
 * @author makejava
 * @since 2019-07-24 16:22:41
 */
public class AuthMenu implements Serializable {
    private static final long serialVersionUID = 520016633720257473L;
    
    private Integer id;
    //权限ID
    private Integer authId;
    //菜单ID
    private Integer menuId;
    //创建时间
    private Date ctime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

}
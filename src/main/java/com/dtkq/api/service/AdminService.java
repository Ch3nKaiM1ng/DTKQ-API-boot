package com.dtkq.api.service;


import com.dtkq.api.entity.Admin;
import com.dtkq.api.entity.Admin;

import java.util.List;

public interface AdminService {

    List<Admin> selectAll();

    Admin selectObj(Integer id);

    Admin checkUser(Admin obj);

    void insertObj(Admin obj);

    void updateObj(Admin obj);

    void delectById(Integer id);
}

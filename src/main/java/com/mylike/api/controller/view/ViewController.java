package com.mylike.api.controller.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@RequestMapping("/admin")
@Controller
public class ViewController {
    @Autowired
    /*private UserManageService userManageService;*/




    //    登陆查询
    @RequestMapping("/test1")
    public ModelAndView testView(HttpSession session) {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("test");
        return mv;
    }

}

package com.dtkq.api.controller.view;

import com.dtkq.api.service.AdminService;
import com.dtkq.api.utils.DateUtils;
import com.dtkq.api.utils.ReturnDiscern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RequestMapping("/Test")
@RestController
public class TestController {
    @Autowired
    private AdminService service;

    //    时间utils
    private DateUtils data = new DateUtils();
    //    返回utils
    private ReturnDiscern re = new ReturnDiscern();
    @Autowired
    HttpSession httpSession ;
    @Autowired
    HttpServletRequest request;

    HttpServletResponse response;
    //  查找所有
    @RequestMapping("/testH5")
    public ModelAndView testH5() {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/view/test");
        return mv;
    }
    @RequestMapping("/doctor")
    public ModelAndView doctorView() {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/view/doctor");
        return mv;
    }

}

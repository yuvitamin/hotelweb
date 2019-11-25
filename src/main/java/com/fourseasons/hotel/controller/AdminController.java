package com.fourseasons.hotel.controller;

import com.fourseasons.hotel.service.AdminService;
import com.fourseasons.hotel.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


/**
 * @author yuzhi
 */
@RestController
@RequestMapping("/account/admin")
public class AdminController {
    @Resource
    AdminService adminService;

    /**
     * 管理员登录
     * @param name
     * @param pwd
     * @return
     */
    @RequestMapping(value = "/login",params = {"name","pwd"})
    public Result login(String name,String pwd){
        Result result = adminService.login(name,pwd);
        return result;
    }

    /**
     * 管理员注册
     * @param name
     * @param pwd
     * @return
     */
    @RequestMapping(value = "/register",params = {"name","pwd"})
    public Result register(String name,String pwd){
        Result result = adminService.register(name,pwd);
        return result;
    }
}

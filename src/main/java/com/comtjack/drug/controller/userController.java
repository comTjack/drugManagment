package com.comtjack.drug.controller;

import com.comtjack.drug.common.ResultMapUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户相关的controller
 */
@Controller
public class userController {
    /**
     * 转向登录页面
     */
    @RequestMapping(value = "/login")
    public String login(){
        return "/login";
    }

    /**
     * 判断用户登录是否成功
     */
    @RequestMapping(value = "toLogin")
    @ResponseBody
    public Object toLogin(String username,String password){
        return ResultMapUtil.getHashMapLogin("hhhha", "1");
    }

    /**
     * 转向后台管理首页
     */
    @RequestMapping(value = "/index")
    public String toLogin(){
        return "/index";
    }
}

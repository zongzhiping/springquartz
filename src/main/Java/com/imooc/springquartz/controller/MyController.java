package com.imooc.springquartz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zzy on 2017/6/25.
 */
@Controller
public class MyController {

    @RequestMapping(value = "login")
    @ResponseBody
    private String hello(
            @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "password", required = false) String password
    ){
        System.out.println(111);
        return "Helo "+username+", Your password is "+password;
    }
}

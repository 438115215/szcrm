package com.gyf.szcrm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    //  @RequestMapping(value = "login",method = RequestMethod.POST)
    //  @PostMapping("login")
    //  @RequestMapping(value = "login",method = RequestMethod.GET)
    @RequestMapping("login")
    public String login(){
        return "login";
    }

    @RequestMapping("login_error")
    public String login_error(){
        return "login_error";
    }

}

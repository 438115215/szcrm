package com.gyf.szcrm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/stuinfo")
public class StuinfoController {


    @ResponseBody
    @RequestMapping("/list")
    public String list(){
        return "stuinfo/list";
    }

}

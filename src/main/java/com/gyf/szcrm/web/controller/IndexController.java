package com.gyf.szcrm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        System.out.println("70........................");
        return "index";
    }

    @RequestMapping("/403")
    public String error403(){
        return "403";
    }
}

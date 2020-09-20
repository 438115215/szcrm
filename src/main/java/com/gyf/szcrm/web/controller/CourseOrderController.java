package com.gyf.szcrm.web.controller;

import com.gyf.szcrm.model.CourseOrder;
import com.gyf.szcrm.model.PageResult;
import com.gyf.szcrm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/courseorder")
public class CourseOrderController {
    @Autowired
    private ICourseOrderService orderService;

    @RequestMapping("/list")
    public ModelAndView list(ModelAndView modelAndView){
        modelAndView.setViewName("/courseorder/list");
        return modelAndView;
    }

    @RequestMapping("listJson")
    public @ResponseBody
    PageResult<CourseOrder> listJson(){

        PageResult<CourseOrder> result=orderService.findPageResult(null,1,8);
        return result;
    }
}

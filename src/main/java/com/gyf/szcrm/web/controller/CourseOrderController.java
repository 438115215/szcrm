package com.gyf.szcrm.web.controller;

import com.gyf.szcrm.model.CURDResult;
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

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView modelAndView){
        modelAndView.setViewName("/courseorder/add");
        return modelAndView;
    }

    @RequestMapping("/edit")
    public ModelAndView edit(ModelAndView modelAndView,String order_id){
        System.out.println("修改订单order_id"+order_id);
        CourseOrder order=orderService.findByOrderId(order_id);
        modelAndView.addObject("order",order);
        modelAndView.setViewName("courseorder/edit");
        return modelAndView;
    }

    @RequestMapping("/detail")
    public ModelAndView detail(ModelAndView modelAndView,String order_id){
        CourseOrder order=orderService.findByOrderId(order_id);
        modelAndView.addObject("order",order);
        modelAndView.setViewName("/courseorder/detail");
        return modelAndView;
    }

    @RequestMapping("/delete")
    public CURDResult delete(ModelAndView modelAndView,String order_id){
        CURDResult result=new CURDResult();
        orderService.deleteByOrderId(order_id);
        modelAndView.setViewName("/courseorder/delete");
        return result;
    }

@RequestMapping("save")
    public CURDResult save(CourseOrder order){

         CURDResult result=new CURDResult();
        if (order.getOrder_id()==null||order.getOrder_id().length()==0){
            orderService.save(order);
        }else{
            orderService.update(order);
        }

    System.out.println(order);

        return result;
    }

    @RequestMapping("listJson")
    public @ResponseBody
    PageResult<CourseOrder> listJson(CourseOrder condition,int page,int limit){
        System.out.println(condition);
        PageResult<CourseOrder> result=orderService.findPageResult(condition,page,limit);
        return result;
    }
}

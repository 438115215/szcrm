package com.gyf.szcrm.web.controller;

import com.gyf.szcrm.model.MonthIncome;
import com.gyf.szcrm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/dataanalysis")
public class DataAnalysisControler {
    @Autowired
    ICourseOrderService orderService;
    @RequestMapping("/income")
    public String income(){
        return "dataanalysis/income";
    }

    @RequestMapping("/MonthIncomes")
    @ResponseBody
    public List<MonthIncome> MonthIncomes(){
        List<MonthIncome> list=orderService.getMonthIncome();

        return list;
    }
}

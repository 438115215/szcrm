package com.gyf.szcrm.service.impl;

import com.gyf.szcrm.mapper.CourseOrderMapper;
import com.gyf.szcrm.model.CourseOrder;
import com.gyf.szcrm.model.PageResult;
import com.gyf.szcrm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ICourseOrderServiceImpl implements ICourseOrderService {
    @Autowired
   private CourseOrderMapper orderMapper;

    @Override
    public PageResult<CourseOrder> findPageResult(CourseOrder condition, int page, int pageSize) {
        PageResult<CourseOrder> result=new PageResult<CourseOrder>();
        result.setCode(0);

        Map<String,Object> params=new HashMap<String,Object>();
        int totalCount=orderMapper.findCountByMap(params);
        result.setCount(totalCount);


        //List<CourseOrder> list=new ArrayList<CourseOrder>();
        List<CourseOrder> list=orderMapper.findListByMap(params);

        result.setData(list);
        return result;

    }
}

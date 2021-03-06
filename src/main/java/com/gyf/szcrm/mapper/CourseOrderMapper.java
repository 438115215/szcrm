package com.gyf.szcrm.mapper;

import com.gyf.szcrm.model.CourseOrder;
import com.gyf.szcrm.model.MonthIncome;

import java.util.List;
import java.util.Map;

public interface CourseOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course_order
     *
     * @mbggenerated Sat Sep 19 23:59:32 CST 2020
     */
    int insert(CourseOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_course_order
     *
     * @mbggenerated Sat Sep 19 23:59:32 CST 2020
     */
    int insertSelective(CourseOrder record);
    

    int findCountByMap(Map<String, Object> params);

    List<CourseOrder> findListByMap(Map<String, Object> params);

    CourseOrder findByOrderId(String order_id);

    void deleteByOrderId(String order_id);

    void update(CourseOrder order);

    List<MonthIncome> getMonthIncomes();
}
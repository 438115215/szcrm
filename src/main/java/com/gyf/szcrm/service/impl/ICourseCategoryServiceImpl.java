package com.gyf.szcrm.service.impl;

import com.gyf.szcrm.mapper.CourseCategoryMapper;
import com.gyf.szcrm.model.CourseCategory;
import com.gyf.szcrm.service.ICourseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICourseCategoryServiceImpl implements ICourseCategoryService {
    @Autowired
    CourseCategoryMapper categoryMapper ;
    @Override
    public List<CourseCategory> findAllLists() {
        return categoryMapper.findAllList();
    }
}

package com.gyf.szcrm.service.impl;

import com.gyf.szcrm.mapper.CourseCategoryMapper;
import com.gyf.szcrm.mapper.UserMapper;
import com.gyf.szcrm.model.CourseCategory;
import com.gyf.szcrm.model.User;
import com.gyf.szcrm.service.ICourseCategoryService;
import com.gyf.szcrm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public User findByUsername(String username) {
        return userMapper.findByUserName(username);
    }
}

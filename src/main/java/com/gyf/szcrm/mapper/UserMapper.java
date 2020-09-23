package com.gyf.szcrm.mapper;

import com.gyf.szcrm.model.CourseCategory;
import com.gyf.szcrm.model.User;

import java.util.List;

public interface UserMapper {
   public User findByUserName(String username);
}
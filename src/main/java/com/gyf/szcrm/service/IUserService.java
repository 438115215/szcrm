package com.gyf.szcrm.service;

import com.gyf.szcrm.model.CourseCategory;
import com.gyf.szcrm.model.User;

import java.util.List;

public interface IUserService {


    public User findByUsername(String username);
}

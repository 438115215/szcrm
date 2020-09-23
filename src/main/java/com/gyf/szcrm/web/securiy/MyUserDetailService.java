package com.gyf.szcrm.web.securiy;

import com.gyf.szcrm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Configuration
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //你要做用户认证
        System.out.println("用户名:"+username);
        //根据用户名从数据库查找，有没有这个用户名
        com.gyf.szcrm.model.User dbUser =userService.findByUsername(username);
        System.out.println(dbUser);
        if (dbUser==null) return null;


        //如果有用户信息则返回USER对象
        //密码是从数据库获取，密码需要加密器进行加密
        String pwd=passwordEncoder.encode(dbUser.getPassword());
        System.out.println("密码加密后:"+pwd);
        return new User(username,//用户名
                pwd, //密码从数据库获取,密码需要进行加密器进行加密
                getCurrentUserAuthorities());//给当前用户进行授权
    }
    //获取当前用户拥有的权限
    public Collection<? extends GrantedAuthority> getCurrentUserAuthorities(){
        List<GrantedAuthority> list= new ArrayList<GrantedAuthority>();

        list.add(new SimpleGrantedAuthority("COURSEORDER_READ"));
        list.add(new SimpleGrantedAuthority("COURSEORDER_DELETE"));
        list.add(new SimpleGrantedAuthority("COURSEORDER_EDIT"));
        list.add(new SimpleGrantedAuthority("COURSEORDER_ADD"));
        list.add(new SimpleGrantedAuthority("COURSEORDER_SAVE"));
        return list;

    }
}

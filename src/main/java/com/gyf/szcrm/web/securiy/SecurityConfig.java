package com.gyf.szcrm.web.securiy;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity//启用web安全功能
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.headers()
                .frameOptions().sameOrigin()
                .httpStrictTransportSecurity().disable();



                 http
                .authorizeRequests()
//                .antMatchers().permitAll()
  //              .antMatchers("/user/**").hasRole("USER")
                         .antMatchers("courseorder/list").hasAnyAuthority("COURSEORDER_READ")
                         .antMatchers("courseorder/listJson").hasAnyAuthority("COURSEORDER_READ")
                         .antMatchers("courseorder/detail").hasAnyAuthority("COURSEORDER_READ")
                         .antMatchers("courseorder/add").hasAnyAuthority("COURSEORDER_ADD")
                         .antMatchers("courseorder/edit").hasAnyAuthority("COURSEORDER_EDIT")
                         .antMatchers("courseorder/save").hasAnyAuthority("COURSEORDER_SAVE")
                         .antMatchers("courseorder/delete").hasAnyAuthority("COURSEORDER_DELETE")
                         .antMatchers("/login").permitAll()
                         .antMatchers("stuinfo/list").permitAll()
                         .antMatchers("/**").fullyAuthenticated()
                         .and()
                         .formLogin()
                         .loginPage("/login");
                        // .failureUrl("/login_error");
    }
}

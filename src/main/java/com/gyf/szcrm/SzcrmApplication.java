package com.gyf.szcrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@MapperScan(basePackages = "com.gyf.szcrm.mapper")
public class SzcrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SzcrmApplication.class, args);
    }

    @Bean
    public PasswordEncoder createPwdEncode(){
        return new BCryptPasswordEncoder();//进行密码进行多次的MD5加盐
    }
}

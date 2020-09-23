package com.gyf.szcrm.web.securiy;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class MyErrorPage implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        //添加错误
        registry.addErrorPages(new ErrorPage(HttpStatus.FORBIDDEN,"/403"));
       // registry.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/404"));
    }
}

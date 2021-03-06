package com.nevergetme.nevergetmeweb.config;

import com.nevergetme.nevergetmeweb.interceptor.RedisSessionInterceptor;
import com.nevergetme.nevergetmeweb.interceptor.RedisSessionRoleInterceptor;
import com.nevergetme.nevergetmeweb.listener.RequestListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class RedisWebSecurityConfig implements WebMvcConfigurer {
    @Resource
    private RedisSessionInterceptor interceptor;
    @Resource
    private RedisSessionRoleInterceptor redisSessionRoleInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(redisSessionRoleInterceptor).addPathPatterns("/admin").excludePathPatterns("/admin/*Statistic*").addPathPatterns("/admin/**");
        registry.addInterceptor(interceptor).
                addPathPatterns("/editArticle").
                excludePathPatterns("/createUser").
                addPathPatterns("/comments/addComments").
                excludePathPatterns("/comments/getComments").
                addPathPatterns("/comments/addReplyComment").
                addPathPatterns("/user/logout").
                addPathPatterns("/article/createArticle").
                addPathPatterns("/article/uploadImage").
                excludePathPatterns("/article/searchArticle").
                excludePathPatterns("/article/getSearchHistory").
                excludePathPatterns("/user/login").
                excludePathPatterns("/user/getAuthCode").
                excludePathPatterns("/").
                excludePathPatterns("/404").
                excludePathPatterns("/article/*").
                excludePathPatterns("/article/showArticle/*").
                excludePathPatterns("/icon/**").
                excludePathPatterns("/js/**").
                excludePathPatterns("/css/**").
                excludePathPatterns("/plug/**").
                excludePathPatterns("/source/**").
                excludePathPatterns("/bootstrap/**").
                excludePathPatterns("/getCurrentUser")
        ;
    }
}

package com.example.yx_login3.Configuration;

import com.example.yx_login3.interceptor.interceptor01;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class JWTconfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new interceptor01())
                .addPathPatterns("/test")
                .excludePathPatterns("/register");
    }
}
package com.wade.cryma.crymaplot.configuration;

import com.wade.cryma.crymaplot.interceptor.DateInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfiguration extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new DateInterceptor()).addPathPatterns("/plot/**");
    }
}

/*
 * 项目名称:gdjs-plus
 * 类名称:ResourceHandlerConfig.java
 * 包名称:com.gdjs.config
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2019/3/15 09:58    GDJS      初版完成
 *
 * Copyright (c) 2019-2019 GDJS
 */
package com.gdjs.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 资源配置
 *
 * @author GDJS
 */
@Component
public class SwaggerResourceHandlerConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //swagger
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/swagger-ui/**").addResourceLocations("classpath:/static/swagger-ui/");
    }
}

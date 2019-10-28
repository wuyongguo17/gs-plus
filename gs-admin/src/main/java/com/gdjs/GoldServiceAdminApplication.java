package com.gdjs;

import com.gdjs.datasources.DynamicDataSourceConfig;
import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

/**
 * 启动类
 *
 * @author GDJS
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, DataSourceAutoConfiguration.class})
@Import({DynamicDataSourceConfig.class})
public class GoldServiceAdminApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(GoldServiceAdminApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GoldServiceAdminApplication.class);
    }
}

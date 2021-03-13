package com.test.config.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

@Configuration
public class MvcConfig {

    @Profile("local")
    @Configuration
    public static class LocalMvcConfig implements WebMvcConfigurer {
        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/**")
                    .addResourceLocations("file:src/main/resources/templates/", "file:src/main/resources/static/")
                    .setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES));
        }
    }

    @Profile("prod")
    @Configuration
    public static class ProdMvcConfig implements WebMvcConfigurer {
        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/**")
                    .addResourceLocations("classpath:/templates/", "classpath:/static/")
                    .setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES));
        }
    }

}

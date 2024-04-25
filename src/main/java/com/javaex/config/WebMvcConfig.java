package com.javaex.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // 주소는 무조건 api로 시작
        .allowedMethods("GET", "POST", "PUT", "DELETE") // 네가지 경우 허락
        .allowedOrigins("*") //vscode에서 주소 허락
        ;
    }
}

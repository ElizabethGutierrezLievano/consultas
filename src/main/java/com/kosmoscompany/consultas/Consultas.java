/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kosmoscompany.consultas;

import com.kosmoscompany.consultas.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author Elizabeth
 */

@SpringBootApplication
public class Consultas {

    public static void main(String[] args) {
        SpringApplication.run(Consultas.class, args);
    }
  
        @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Autowired
            private AppConfig config;

            @Override
            public void addCorsMappings(CorsRegistry registry) {
                String regex = "\\s*,\\s*";
                
                registry.addMapping("/**")
                        .allowedOrigins(config.getAllowedOrigins().split(regex))
                        .allowedMethods(config.getAllowedMethods().split(regex))
                        .allowedHeaders(config.getAllowedHeaders().split(regex))
                        .exposedHeaders(config.getExposedHeaders().split(regex));
            }
        };
    }
}

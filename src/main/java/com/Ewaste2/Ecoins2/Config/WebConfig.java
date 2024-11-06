//package com.Ewaste2.Ecoins2.Config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")  // Allow all endpoints
//                .allowedOrigins("http://localhost:3000")  // Allow requests from React frontend
//                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allow all necessary HTTP methods
//                .allowedHeaders("*")  // Allow all headers
//                .allowCredentials(true);  // Allow credentials (cookies, authorization headers)
//    }
//}

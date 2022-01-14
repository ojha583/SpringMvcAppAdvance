package com.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by aojha on 1/15/22
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.mvc.controllers")
public class LoveCalculatorAppConfig {
  @Bean
  public InternalResourceViewResolver viewResolver(){
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/view/");
    resolver.setSuffix(".jsp");
    return  resolver;
  }
}

package com.mvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by aojha on 1/14/22
 */
public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {
  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    System.out.println("Testing whether TOMCAT CONTAINER DETECT THIS INITIALIZER CLASS");
  }
}
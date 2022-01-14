package com.mvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by aojha on 1/14/22
 */
public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {
  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {

    //create spring web application container
    XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
    webApplicationContext.setConfigLocation("classpath:beans.xml");

    //create dispatcher servlet
    DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);


    ServletRegistration.Dynamic dynamic = servletContext.addServlet("spring-dispatcher", dispatcherServlet);
    dynamic.setLoadOnStartup(1);
    dynamic.addMapping("/home.com/*");

  }
}
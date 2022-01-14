package com.mvc.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * Created by aojha on 1/15/22
 */
public class LoveAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[0];
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    Class cl[] = {LoveCalculatorAppConfig.class};
    return cl;
  }

  @Override
  protected String[] getServletMappings() {
    return new String[]{"/home.com/*"};
  }
}

package com.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aojha on 1/15/22
 */
@Controller
public class HomeController {

  @RequestMapping("/welcome")
  public String welcome(){
    return "welcome";
  }
}

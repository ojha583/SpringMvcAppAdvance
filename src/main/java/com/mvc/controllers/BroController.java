package com.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by aojha on 1/13/22
 */
@Controller
public class BroController {

  @RequestMapping("/cricket")
  public String cricketBat(){
    return "/view/Cricket.jsp";
  }
}

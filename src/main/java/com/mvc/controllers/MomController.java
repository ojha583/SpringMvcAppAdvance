package com.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by aojha on 1/12/22
 */
@Controller
public class MomController {

  @RequestMapping("/sugar")
  public String welcome(){
    return "Sugar";
  }
}

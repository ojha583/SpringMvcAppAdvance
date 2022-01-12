package com.mvc.cafe;

import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by aojha on 1/13/22
 */
@Controller
public class CafeController {

  @RequestMapping("/cafe")
  public String home() {
    return "Cafe";
  }

  @RequestMapping("/placeOrder")
  public String submitOrder(HttpServletRequest servletRequest, Model model) {
      String foodType = servletRequest.getParameter("foodType");
      model.addAttribute("foodTypeSelected", foodType);
      return "OrderProcessed";
  }
}

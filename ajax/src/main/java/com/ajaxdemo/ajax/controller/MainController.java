package com.ajaxdemo.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
@RequestMapping("test/main")
  public String testMain() {

    return "test/main";

  }
}
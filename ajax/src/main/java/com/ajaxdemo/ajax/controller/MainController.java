package com.ajaxdemo.ajax.controller;

import java.util.List;

import com.ajaxdemo.ajax.model.ArticleVO;
import com.ajaxdemo.ajax.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @Autowired
  ArticleService articleService;

  @RequestMapping("test/main")
    public String testMain(Model model) {

      List<ArticleVO> list = articleService.getList();

      model.addAttribute("list", list);

    return "test/main";

  }
}
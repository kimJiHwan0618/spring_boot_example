package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.ArticleVO;
import com.example.demo.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArticleController {

  @Autowired
  ArticleService articleService;

  @RequestMapping("/article/list")
  public String main(Model model) {
    List<ArticleVO> list = articleService.getList();

    model.addAttribute("list", list);

    return "article/list";
  }
}

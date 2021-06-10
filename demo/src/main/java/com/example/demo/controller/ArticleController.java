package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import com.example.demo.model.ArticleVO;
import com.example.demo.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

  @RequestMapping("/article/add")
  public String listAdd() {

    return "article/add";

  }

  @RequestMapping("/article/doAdd")
  @ResponseBody
  public String doAdd(@RequestParam Map<String, Object> param) {
                                     // default param 값 {}
                                     // {
                                      // key : [value]
                                     // } 

    long newId = articleService.addList(param);

    return newId + "번 게시글이 추가되었습니다.";

  }

}

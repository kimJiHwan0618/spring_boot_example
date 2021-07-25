package com.ajaxdemo.ajax.controller;

import java.util.List;
import java.util.Map;

import com.ajaxdemo.ajax.model.ArticleVO;
import com.ajaxdemo.ajax.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

  @Autowired
  ArticleService articleService;


  @RequestMapping("/doAdd")
  @ResponseBody
  public Object doAdd(@RequestParam Map<String, Object> param) {
	  
	  
	  articleService.addList(param);
    
	  return articleService.getList();
	  
  }
  // 리스트 추가
  
  @RequestMapping("/doDelete")
  @ResponseBody
  public String doDelete(long id) {

    articleService.delete(id);

    return "삭제 성공!";

  }
  // 리스트 삭제

  @RequestMapping("/doModify")
  @ResponseBody
  public Object doModify(@RequestParam Map<String, Object> param, long id, Model model) {

    articleService.listModify(param);
    ArticleVO article = articleService.getOne(id);
    model.addAttribute("article", article);

    return article;

  }
  // 리스트 수정
}

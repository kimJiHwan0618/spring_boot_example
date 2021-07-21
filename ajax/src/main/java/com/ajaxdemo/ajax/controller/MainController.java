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
public class MainController {

  @Autowired
  ArticleService articleService;

  @RequestMapping("test/main")
    public String testMain(Model model) {

      List<ArticleVO> list = articleService.getList();
      System.out.print(list);
      model.addAttribute("list", list);

    return "test/main";
    
  }
  
  @RequestMapping("/test/doAdd")
  @ResponseBody
  public Object doAdd(@RequestParam Map<String, Object> param) {
	  
//	  long newId = articleService.addList(param);
	  
	  articleService.addList(param);
//	  model.addAttribute("addList", param);
    
	  return articleService.getList();
	  
  }
  
}
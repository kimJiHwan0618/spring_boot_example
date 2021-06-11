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
    int totalCount = articleService.getTotalCount();

    model.addAttribute("list", list);
    model.addAttribute("totalCount", totalCount);

    return "article/list";
  }

  @RequestMapping("/article/detail")
  public String showDetail(Model model, long id) {
    
    ArticleVO article = articleService.getOne(id);
    

    model.addAttribute("article", article);

    return "article/detail";

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

    String msg =  newId + "번 게시글이 추가되었습니다.";

    StringBuilder sb = new StringBuilder();

    sb.append("alert('"+ msg +"');");
    sb.append("location.replace('./detail?id="+ newId +"')");
    
    sb.insert(0,"<script>");
    sb.append("</script>");

    return sb.toString();

  }

  @RequestMapping("/article/doDelete")
  @ResponseBody
  public String doDelete(long id) {

    articleService.delete(id);

    String msg =  id + "번 게시글이 삭제되었습니다.";

    StringBuilder sb = new StringBuilder();

    sb.append("alert('"+ msg +"');");
    sb.append("location.replace('./detail?id="+ id +"')");
    
    sb.insert(0,"<script>");
    sb.append("</script>");

    return sb.toString();

  }

}

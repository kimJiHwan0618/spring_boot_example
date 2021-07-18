package com.ajaxdemo.ajax.service;

import java.util.List;
import java.util.Map;

import com.ajaxdemo.ajax.model.ArticleVO;

public interface ArticleService {

  public List<ArticleVO> getList();
  
  public long addList(Map<String, Object> param);
  
}

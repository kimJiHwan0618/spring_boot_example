package com.ajaxdemo.ajax.service;

import java.util.List;

import com.ajaxdemo.ajax.mapper.ArticleMapper;
import com.ajaxdemo.ajax.model.ArticleVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

  @Autowired
  ArticleMapper articleMapper;

  public List<ArticleVO> getList() {
    return articleMapper.getList();
  }
  
}


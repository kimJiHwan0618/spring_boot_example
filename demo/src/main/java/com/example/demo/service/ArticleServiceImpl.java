package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.mapper.ArticleMapper;
import com.example.demo.model.ArticleVO;

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

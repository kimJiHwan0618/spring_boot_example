package com.example.demo.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.example.demo.mapper.ArticleMapper;
import com.example.demo.model.ArticleVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {

  @Autowired
  ArticleMapper articleMapper;

  public List<ArticleVO> getList() {
    return articleMapper.getList();
  }

  @Override
  public long addList(Map<String, Object> param) {  
    articleMapper.addList(param);

    BigInteger bigIntId = (BigInteger)param.get("id");
    long newId = bigIntId.longValue();

    return newId;
  }

}

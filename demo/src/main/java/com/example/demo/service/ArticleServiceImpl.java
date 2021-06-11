package com.example.demo.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.example.demo.mapper.ArticleMapper;
import com.example.demo.model.ArticleVO;
import com.example.demo.util.Cutil;

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

    return Cutil.getAsLong(param.get("id"));
  }

  @Override
  public int getTotalCount() {  

    return articleMapper.getTotalCount();

  }

  @Override
  public ArticleVO getOne(long id) {  

    return articleMapper.getOne(id);

  }

  @Override
  public void delete(long id) {  

   articleMapper.delete(id);

  }

}

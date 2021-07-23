package com.ajaxdemo.ajax.service;

import java.util.List;
import java.util.Map;

import com.ajaxdemo.ajax.mapper.ArticleMapper;
import com.ajaxdemo.ajax.model.ArticleVO;
import com.ajaxdemo.ajax.util.Cutil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
  public void delete(long id) {  

   articleMapper.delete(id);

  }

  @Override
  public void listModify(Map<String, Object> param) {  

    articleMapper.listModify(param);
   
  }

  @Override
  public ArticleVO getOne(long id) {  

    return articleMapper.getOne(id);

  }
}


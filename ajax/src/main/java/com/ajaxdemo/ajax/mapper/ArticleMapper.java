package com.ajaxdemo.ajax.mapper;

import java.util.List;

import com.ajaxdemo.ajax.model.ArticleVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

  public List<ArticleVO> getList();
  
}

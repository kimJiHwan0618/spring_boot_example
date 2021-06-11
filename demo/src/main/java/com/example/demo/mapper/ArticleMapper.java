package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import com.example.demo.model.ArticleVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

  public List<ArticleVO> getList();

  public void addList(Map<String, Object> param);

  public int getTotalCount();
  
}

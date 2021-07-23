package com.ajaxdemo.ajax.mapper;

import java.util.List;
import java.util.Map;

import com.ajaxdemo.ajax.model.ArticleVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

  public List<ArticleVO> getList();
  
  public void addList(Map<String, Object> param);
  
  public void delete(long id);

  public void listModify(Map<String, Object> param);

  public ArticleVO getOne(long id);
}

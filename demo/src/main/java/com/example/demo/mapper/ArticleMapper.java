package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import com.example.demo.model.ArticleVO;
import com.example.demo.model.CommentVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

  public List<ArticleVO> getList();

  public void addList(Map<String, Object> param);

  public int getTotalCount();

  public ArticleVO getOne(long id);

  public void delete(long id);

  public void listModify(Map<String, Object> param);

  public void hitUp(long id);

  public List<CommentVO> getCommentList();
  
}

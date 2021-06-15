package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.model.ArticleVO;
import com.example.demo.model.CommentVO;

public interface ArticleService {

  public List<ArticleVO> getList();

  public List<CommentVO> getCommentList(long id);
  
  // public long addComment(Map<String, Object> param);

  public long addList(Map<String, Object> param);


  public int getTotalCount();

  public ArticleVO getOne(long id);

  public void delete(long id);

  public void listModify(Map<String, Object> param);

  public void hitUp(long id);

  public void addComment(Map<String, Object> param);
  
}

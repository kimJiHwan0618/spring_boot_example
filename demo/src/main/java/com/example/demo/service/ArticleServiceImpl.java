package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.mapper.ArticleMapper;
import com.example.demo.mapper.CommentMapper;
import com.example.demo.model.ArticleVO;
import com.example.demo.model.CommentVO;
import com.example.demo.util.Cutil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ArticleServiceImpl implements ArticleService {

  @Autowired
  ArticleMapper articleMapper;
  @Autowired
  CommentMapper commentMapper;

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

  @Override
  public void listModify(Map<String, Object> param) {  

   articleMapper.listModify(param);
   
  }

  @Override
  public void hitUp(long id) {
    articleMapper.hitUp(id);
  }

  @Override
  public List<CommentVO> getCommentList(long id) {
    
    return commentMapper.getCommentList(id);

  }

  @Override
  public void addComment(Map<String, Object> param) {
    commentMapper.addComment(param);
  }
}

package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import com.example.demo.model.CommentVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {

  public List<CommentVO> getCommentList(long id);

  public void addComment(Map<String, Object> param);
  
}

package com.ajaxdemo.ajax.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleVO {
  private long id;
  private String regDate;
  private String title;
  private String body;
}


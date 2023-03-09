package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ArticleVO;
import com.example.demo.model.CommentVO;

public interface  ArticleService {

	void insertArticle(ArticleVO vo);

	List<ArticleVO> listArticle(String srch_title);

	void deleteArticle(int ano);

	void updateArticle(ArticleVO vo);

	ArticleVO detailArticle(ArticleVO vo,int ano);

}
 
package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.ArticleVO;

@Mapper
public interface  ArticleDao {
	
	void insert(ArticleVO article);

	List<ArticleVO> list();

	void delete(int ano);

	void update(ArticleVO vo);

	ArticleVO detail(ArticleVO vo,int ano);
}

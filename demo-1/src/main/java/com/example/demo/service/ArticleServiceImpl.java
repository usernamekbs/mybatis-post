package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ArticleDao;
import com.example.demo.model.ArticleVO;

@Service
public class ArticleServiceImpl implements ArticleService{
	@Autowired
	private ArticleDao dao;
	
	
	@Override
	public void insertArticle(ArticleVO article) {
		dao.insert(article);
	}


	@Override
	public List<ArticleVO> listArticle() {
		return dao.list();
	}


	@Override
	public void deleteArticle(int ano) {
		dao.delete(ano);
		   
	}


	@Override
	public void updateArticle(ArticleVO vo) {
		System.out.println(vo.getAno());
		dao.update(vo);
		
	}


	@Override
	public ArticleVO detailArticle(ArticleVO vo,int ano) {
		System.out.println(vo.getAno());
		return dao.detail(vo,ano);
	}

} 
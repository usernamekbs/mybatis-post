package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ArticleVO;
import com.example.demo.service.ArticleService;

@RestController
public class ArticleController {
	 
	@Autowired
	private ArticleService service;
	
	@ResponseBody
	@PostMapping("/create") 
	public void save(@RequestBody ArticleVO vo) {
		service.insertArticle(vo);
	}
	 
	@ResponseBody
	@GetMapping("/list") 
	public List<ArticleVO> list() {
		
		return service.listArticle();
		
	}
	
	@ResponseBody
	@DeleteMapping("/delete") 
	public void delete(@RequestBody ArticleVO vo) {
		service.deleteArticle(vo.getAno());
	}
	
	@GetMapping("/detail") 
	public ArticleVO detail(ArticleVO vo,@RequestParam(name="ano") int ano) {
		return service.detailArticle(vo,ano);
	} 
	
	@PostMapping("/update") 
	public void update(ArticleVO vo) {
		if(vo.getAno()!=0) {
			service.updateArticle(vo);
		}
	}
}

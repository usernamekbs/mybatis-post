package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ArticleVO;
import com.example.demo.model.CommentVO;
import com.example.demo.service.CommentService;

@RestController
public class CommentController {

	@Autowired
	private CommentService service;

	
	 @PostMapping("/comment/create") 
	 public void save(@RequestBody CommentVO vo) {
		 service.insertComment(vo); 
	 }

	@ResponseBody
	@GetMapping("/comment/list")
	public List<CommentVO> list() {
		return service.listComment();
	}
	
	@PostMapping("/comment/update") 
	public void update(CommentVO vo) {
		service.updateComment(vo);
	}
	
	@DeleteMapping("/comment/delete") 
	public void delete(CommentVO vo) {
		service.deleteComment(vo.getCno());
	}
}

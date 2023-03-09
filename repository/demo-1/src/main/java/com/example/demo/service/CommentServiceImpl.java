package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CommentDao;
import com.example.demo.model.ArticleVO;
import com.example.demo.model.CommentVO;

@Service
public class CommentServiceImpl implements CommentService{
	@Autowired
	private CommentDao dao;
	@Override
	public List<CommentVO> listComment() {
		return dao.list();
	}
	@Override
	public void insertComment(CommentVO vo) {
		dao.insert(vo);
		
	}
	
	@Override
	public void updateComment(CommentVO vo) {
		dao.update(vo);
	}
	@Override
	public void deleteComment(int cno) {
		dao.delete(cno);
	}

}

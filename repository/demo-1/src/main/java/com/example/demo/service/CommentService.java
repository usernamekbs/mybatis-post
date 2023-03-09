package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CommentVO;

public interface CommentService {

	List<CommentVO> listComment();

	void insertComment(CommentVO vo);

	void updateComment(CommentVO vo);

	void deleteComment(int cno);

}

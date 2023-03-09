package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.CommentVO;

@Mapper
public interface CommentDao {

	List<CommentVO> list();

	void insert(CommentVO vo);

	void update(CommentVO vo);

	void delete(int cno);
}

package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class ArticleVO {
	private int ano;
	private String title;
	private String content;
	private String writer;
	private String message;
	private int cnt;
	private String srch_title;
	
	public String getSrch_title() {
		return srch_title;
	}
	public void setSrch_title(String srch_title) {
		this.srch_title = srch_title;
	}
	public int getCnt() {
		return cnt;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
}

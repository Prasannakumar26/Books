package com.goodreads.GoodReadsH2Database.BookModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookId;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookUrl() {
		return bookUrl;
	}
	public void setBookUrl(String bookUrl) {
		this.bookUrl = bookUrl;
	}
	private String bookName;
	private String bookUrl;
	
	public Book() {};
	public Book(Integer bookId,String bookName,String bookUrl) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookUrl = bookUrl;
	}
	
}

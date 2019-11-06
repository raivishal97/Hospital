package com.training;

public class Book {
	private String author;
	private String bookName;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String author, String bookName) {
		super();
		this.author = author;
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
}

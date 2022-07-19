package com.ShoppingCart.Books;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
	
	@Id
	private int booksId;
	
	
	private String bookName;
	
	
	private String author;
	
	
	private double price;

	public int getBooksId() {
		return booksId;
	}

	public void setBooksId(int booksId) {
		this.booksId = booksId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Books(int booksId, String bookName, String author, double price) {
		super();
		this.booksId = booksId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	
	
}

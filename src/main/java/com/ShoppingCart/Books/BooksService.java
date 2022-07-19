package com.ShoppingCart.Books;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BooksService {

	List<Books> books= new ArrayList<>();
	
	BooksService(){
		System.out.println("Books Service");
		books.add(new Books(101, "Let us C", "Yashavant P. Kanetkar", 200));
		books.add(new Books(102, "SQL The Complete Reference", "James Groff", 667));
		books.add(new Books(103, "Thinking In Java", "Bruce Eckel", 300));
		books.add(new Books(104, "Computer Networking", "James F. Kurose", 250));
	}
	
	//Returns All the Books
	public List<Books> getAllTheBooks(){
		return books;
	}
	
	//Returns Single Book
	public Books getBook(int Id) {
		for(Books b: books) {
			if(b.getBooksId()==Id) {
				return b;
			}
		}
		return null;
	}
	//Save the book
	public void saveBook(Books books) {
		this.books.add(books);
	}
	
	//update the book
	public void updateBook(Books updatebooks) {
		for(Books b : books) {
			if(b.getBooksId()==updatebooks.getBooksId()) {
				b.setBookName(updatebooks.getBookName());
				b.setAuthor(updatebooks.getAuthor());
				b.setPrice(updatebooks.getPrice());
			}
		}
	}
	
	//Remove the book
	public void deleteBook(int booksId) {
		books.remove(booksId);
	}
}

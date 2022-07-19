package com.ShoppingCart.Books;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
	
	@Autowired
	private BooksRepository booksRepository;
	
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
		
		List<Books> bookList = new ArrayList<>();
		booksRepository.findAll().forEach(bookList::add);
		return bookList;
	}
	
	//Returns Single Book
	public Books getBook(int Id) {
		
//		for(Books b: books) {
//			if(b.getBooksId()==Id) {
//				return b;
//			}
//		}
//		return null;
		
		Optional<Books> bookById = booksRepository.findById(Id);
		if(bookById.isPresent()) {
			return bookById.get();
		}
		return null;
	}
	
	//Save the book
	public void saveBook(Books books) {
		//this.books.add(books);
		booksRepository.save(books);
	} 
	
//	 *** for postman ***
//	{
//        "booksId": 101,
//        "bookName": "Let us C",
//        "author": "Yashavant P. Kanetkar",
//        "price": 200.0
//    }
	
	//update the book
	public void updateBook(Books updatebooks) {
//		for(Books b : books) {
//			if(b.getBooksId()==updatebooks.getBooksId()) {
//				b.setBookName(updatebooks.getBookName());
//				b.setAuthor(updatebooks.getAuthor());
//				b.setPrice(updatebooks.getPrice());
//			}
//		}
		
		booksRepository.save(updatebooks);
	}
	
	//Remove the book {deleting the index // not the bookID!!}
	public void deleteBook(int booksId) {
//		books.remove(booksId);
		
		booksRepository.deleteById(booksId);
	}
}

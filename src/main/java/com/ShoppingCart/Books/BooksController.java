package com.ShoppingCart.Books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@Autowired
	BooksService booksService;
	
	//returns all the books -> GET
	@RequestMapping(value ="/books", method = RequestMethod.GET)
	public List<Books> getAllBooks(){
		return booksService.getAllTheBooks();
	}
	
	//returns single book -> GET
	@RequestMapping(value ="/books/{id}", method = RequestMethod.GET)
	public Books getBook(@PathVariable int id) {
		return booksService.getBook(id);
	}
	
	//saving the book -> POST
	@RequestMapping(value ="/books/save", method = RequestMethod.POST)
	public void saveBook(@RequestBody Books books) {
		booksService.saveBook(books);
	}
	
	//updating the player -> PUT
	@RequestMapping(value = "/books/update", method = RequestMethod.PUT)
	public void updateBook(@RequestBody Books books) {
		booksService.updateBook(books);
	}
	
	//Deleting the book ->DELETE
	@RequestMapping(value = "/books/delete/{booksId}", method = RequestMethod.DELETE)
	public void deleteBook(@PathVariable int booksId) {
		booksService.deleteBook(booksId);
	}
}
